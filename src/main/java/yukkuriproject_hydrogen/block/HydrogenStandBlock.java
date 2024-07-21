package yukkuriproject_hydrogen.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;

public class HydrogenStandBlock extends HorizontalDirectionalBlock {
    public HydrogenStandBlock() {
        super(Properties.of());
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }
}
