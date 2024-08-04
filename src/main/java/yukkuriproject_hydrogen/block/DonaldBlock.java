package yukkuriproject_hydrogen.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import yukkuriproject_hydrogen.entities.DonaldMagic;

public class DonaldBlock extends Block {
    public DonaldBlock() {
        super(Properties.of().destroyTime(10));
    }

    @Override
    public void playerDestroy(Level level, Player player, BlockPos blockPos, BlockState blockState, @Nullable BlockEntity blockEntity, ItemStack itemStack) {
        super.playerDestroy(level, player, blockPos, blockState, blockEntity, itemStack);

        player.die(player.damageSources().magic());

        level.addFreshEntity(new DonaldMagic(level, blockPos.getX(), blockPos.getY(), blockPos.getZ(), player));
    }
}
