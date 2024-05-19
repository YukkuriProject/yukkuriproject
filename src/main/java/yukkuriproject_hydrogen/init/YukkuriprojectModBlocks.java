
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yukkuriproject_hydrogen.init;

import yukkuriproject_hydrogen.block.MachinetubeBlock;
import yukkuriproject_hydrogen.block.HydrogenmachinetubeBlock;
import yukkuriproject_hydrogen.block.HydrogenblockBlock;
import yukkuriproject_hydrogen.block.HydrogenExtractionMachineBlock;

import yukkuriproject_hydrogen.YukkuriprojectMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

public class YukkuriprojectModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, YukkuriprojectMod.MODID);
	public static final DeferredHolder<Block, Block> HYDROGENBLOCK = REGISTRY.register("hydrogenblock", () -> new HydrogenblockBlock());
	public static final DeferredHolder<Block, Block> MACHINETUBE = REGISTRY.register("machinetube", () -> new MachinetubeBlock());
	public static final DeferredHolder<Block, Block> HYDROGENMACHINETUBE = REGISTRY.register("hydrogenmachinetube", () -> new HydrogenmachinetubeBlock());
	public static final DeferredHolder<Block, Block> HYDROGEN_EXTRACTION_MACHINE = REGISTRY.register("hydrogen_extraction_machine", () -> new HydrogenExtractionMachineBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
