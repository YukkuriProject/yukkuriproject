package yukkuriproject_hydrogen.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.Nullable;
import yukkuriproject_hydrogen.entities.DonaldMagic;

public class DonaldBlock extends Block {
    public DonaldBlock() {
        super(Properties.of().destroyTime(1));
    }

    @Override
    public void destroy(LevelAccessor accessor, BlockPos blockPos, BlockState blockState) {
        super.destroy(accessor, blockPos, blockState);


    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

    @Override
    public BlockState playerWillDestroy(Level level, BlockPos blockPos, BlockState blockState, Player player) {
        return super.playerWillDestroy(level, blockPos, blockState, player);
    }

    @Override
    public void playerDestroy(Level level, Player player, BlockPos blockPos, BlockState blockState, @Nullable BlockEntity blockEntity, ItemStack itemStack) {
        super.playerDestroy(level, player, blockPos, blockState, blockEntity, itemStack);

        if (!level.isClientSide) {
            player.die(player.damageSources().magic());
        }

        level.addFreshEntity(new DonaldMagic(level, blockPos.getX(), blockPos.getY(), blockPos.getZ(), player));
    }
}
