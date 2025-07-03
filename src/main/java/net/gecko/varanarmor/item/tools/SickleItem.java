package net.gecko.varanarmor.item.tools;

import com.google.common.collect.ImmutableMap;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.*;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.minecraft.world.event.GameEvent;

import java.util.Map;
import java.util.Optional;

public class SickleItem extends MiningToolItem {
    protected static final Map<Block, Block> DEINFESTED_BLOCKS = new ImmutableMap.Builder<Block, Block>()
            .put(Blocks.INFESTED_COBBLESTONE, Blocks.COBBLESTONE)
            .put(Blocks.INFESTED_STONE, Blocks.STONE)
            .put(Blocks.INFESTED_STONE_BRICKS, Blocks.STONE_BRICKS)
            .put(Blocks.INFESTED_MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS)
            .put(Blocks.INFESTED_CRACKED_STONE_BRICKS, Blocks.CRACKED_STONE_BRICKS)
            .put(Blocks.INFESTED_CHISELED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS)
            .build();
    protected static final Map<Block, Block> DEINFESTED_PILLAR_BLOCKS = new ImmutableMap.Builder<Block, Block>()
            .put(Blocks.INFESTED_DEEPSLATE, Blocks.DEEPSLATE)
            .build();

    public SickleItem(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.HOE_MINEABLE, settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (state.isOf(Blocks.COBWEB)) {
            return 30.0F;
        } else {
            Material material = state.getMaterial();
            return material != Material.WOOD && material != Material.NETHER_WOOD ? 1.0F : 0.75F;
        }
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        PlayerEntity playerEntity = context.getPlayer();
        BlockState blockState = world.getBlockState(blockPos);
        Optional<BlockState> infestedState = this.getInfestedState(blockState);
        Optional<BlockState> infestedPillarState = this.getInfestedPillarState(blockState);
        ItemStack itemStack = context.getStack();
        Optional<BlockState> empty = Optional.empty();
        if (infestedState.isPresent()) {
            world.playSound(playerEntity, blockPos, SoundEvents.ENTITY_SILVERFISH_DEATH, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.syncWorldEvent(playerEntity, WorldEvents.WAX_REMOVED, blockPos, 0);
            empty = infestedState;
        } else if (infestedPillarState.isPresent()) {
            world.playSound(playerEntity, blockPos, SoundEvents.ENTITY_SILVERFISH_DEATH, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.syncWorldEvent(playerEntity, WorldEvents.WAX_REMOVED, blockPos, 0);
            empty = infestedPillarState;
        }

        if (empty.isPresent()) {
            if (playerEntity instanceof ServerPlayerEntity) {
                Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity)playerEntity, blockPos, itemStack);
            }

            world.setBlockState(blockPos, empty.get(), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, empty.get()));
            if (playerEntity != null) {
                itemStack.damage(8, playerEntity, p -> p.sendToolBreakStatus(context.getHand()));
            }

            return ActionResult.success(world.isClient);
        } else {
            return ActionResult.PASS;
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.getGroup() == EntityGroup.ARTHROPOD){
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS,200,2));
            target.damage(DamageSource.GENERIC,2);
        }
        stack.damage(1, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return true;
    }

    private Optional<BlockState> getInfestedState(BlockState state) {
        return Optional.ofNullable(DEINFESTED_BLOCKS.get(state.getBlock()))
                .map(Block::getDefaultState);
    }
    private Optional<BlockState> getInfestedPillarState(BlockState state) {
        return Optional.ofNullable(DEINFESTED_PILLAR_BLOCKS.get(state.getBlock()))
                .map(block -> block.getDefaultState().with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)));
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        return state.isOf(Blocks.COBWEB);
    }
}
