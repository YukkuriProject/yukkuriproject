
package yukkuriproject_hydrogen.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;

public class MachinetubeBlock extends IronBarsBlock {
	public MachinetubeBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.GRAVEL).strength(1f, 10f));
	}
}
