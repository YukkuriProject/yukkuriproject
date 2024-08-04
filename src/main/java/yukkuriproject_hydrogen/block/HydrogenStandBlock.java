package yukkuriproject_hydrogen.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import org.jetbrains.annotations.Nullable;

public class HydrogenStandBlock extends HorizontalDirectionalBlock {
    public EnumProperty<HalfState> HALF = EnumProperty.create("state", HalfState.class);

    public HydrogenStandBlock() {
        super(Properties.of());
        this.registerDefaultState(
                this.stateDefinition.any()
                        .setValue(HALF, HalfState.LOWER)
        );
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        Level level = context.getLevel();
        if (blockpos.getY() < level.getMaxBuildHeight() - 1 && level.getBlockState(blockpos.above()).canBeReplaced(context)) {
            return this.defaultBlockState()
                    .setValue(HALF, HalfState.LOWER);
        } else {
            return null;
        }
    }

    @Override
    public void setPlacedBy(Level level, BlockPos blockPos, BlockState state, @Nullable LivingEntity entity, ItemStack itemStack) {
        level.setBlock(blockPos.above(), state.setValue(HALF, HalfState.UPPER), 3);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }

    @Override
    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        return blockState.getValue(HALF) == HalfState.LOWER ?
                !levelReader.getBlockState(blockPos.above()).is(Blocks.AIR) :
                !levelReader.getBlockState(blockPos.below()).is(Blocks.AIR);
    }

    @Override
    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        return this.canSurvive(blockState, levelAccessor, blockPos) ? super.updateShape(blockState, direction, blockState2, levelAccessor, blockPos, blockPos2) : Blocks.AIR.defaultBlockState();
    }

    public enum HalfState implements StringRepresentable {
        UPPER,
        LOWER;

        @Override
        public String getSerializedName() {
            return this == UPPER ? "upper" : "lower";
        }
    }
}
