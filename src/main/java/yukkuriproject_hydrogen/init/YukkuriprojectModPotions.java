
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yukkuriproject_hydrogen.init;

import yukkuriproject_hydrogen.YukkuriprojectMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

public class YukkuriprojectModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, YukkuriprojectMod.MODID);
	public static final DeferredHolder<Potion, Potion> HYDROGEN = REGISTRY.register("hydrogen", () -> new Potion(new MobEffectInstance(MobEffects.HARM, 3621, 255, false, true), new MobEffectInstance(MobEffects.BLINDNESS, 3645, 255, true, true)));
}
