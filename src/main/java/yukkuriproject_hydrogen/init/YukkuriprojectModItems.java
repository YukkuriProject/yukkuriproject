
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yukkuriproject_hydrogen.init;

import yukkuriproject_hydrogen.item.HydrogenwaterItem;

import yukkuriproject_hydrogen.YukkuriprojectMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

public class YukkuriprojectModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, YukkuriprojectMod.MODID);
	public static final DeferredHolder<Item, Item> HYDROGENWATER = REGISTRY.register("hydrogenwater", () -> new HydrogenwaterItem());
	public static final DeferredHolder<Item, Item> HYDROGENBLOCK = block(YukkuriprojectModBlocks.HYDROGENBLOCK);
	public static final DeferredHolder<Item, Item> MACHINETUBE = block(YukkuriprojectModBlocks.MACHINETUBE);
	public static final DeferredHolder<Item, Item> HYDROGENMACHINETUBE = doubleBlock(YukkuriprojectModBlocks.HYDROGENMACHINETUBE);
	public static final DeferredHolder<Item, Item> HYDROGEN_EXTRACTION_MACHINE = block(YukkuriprojectModBlocks.HYDROGEN_EXTRACTION_MACHINE);

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredHolder<Item, Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
