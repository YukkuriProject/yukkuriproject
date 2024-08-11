
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yukkuriproject_hydrogen.init;

import yukkuriproject_hydrogen.block.*;

import yukkuriproject_hydrogen.YukkuriprojectMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

public class YukkuriprojectModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, YukkuriprojectMod.MODID);
	public static final DeferredHolder<Block, Block> HYDROGENBLOCK = REGISTRY.register("hydrogenblock", HydrogenblockBlock::new);
	public static final DeferredHolder<Block, Block> MACHINETUBE = REGISTRY.register("machinetube", MachinetubeBlock::new);
	public static final DeferredHolder<Block, Block> HYDROGENMACHINETUBE = REGISTRY.register("hydrogenmachinetube", HydrogenmachinetubeBlock::new);
	public static final DeferredHolder<Block, Block> HYDROGEN_EXTRACTION_MACHINE = REGISTRY.register("hydrogen_extraction_machine", HydrogenExtractionMachineBlock::new);
	public static final DeferredHolder<Block, Block> HYDROGEN_STAND = REGISTRY.register("hydrogen_stand", HydrogenStandBlock::new);
	public static final DeferredHolder<Block, Block> DONALD_BLOCK = REGISTRY.register("donald_block", DonaldBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
