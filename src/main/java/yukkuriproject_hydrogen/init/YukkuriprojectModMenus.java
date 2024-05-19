
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package yukkuriproject_hydrogen.init;

import yukkuriproject_hydrogen.world.inventory.HydrogenEGUIMenu;

import yukkuriproject_hydrogen.YukkuriprojectMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

public class YukkuriprojectModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, YukkuriprojectMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<HydrogenEGUIMenu>> HYDROGEN_EGUI = REGISTRY.register("hydrogen_egui", () -> IMenuTypeExtension.create(HydrogenEGUIMenu::new));
}
