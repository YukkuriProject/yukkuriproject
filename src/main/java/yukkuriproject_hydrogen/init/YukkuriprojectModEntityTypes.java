package yukkuriproject_hydrogen.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;
import yukkuriproject_hydrogen.YukkuriprojectMod;
import yukkuriproject_hydrogen.entities.DonaldMagic;

public class YukkuriprojectModEntityTypes {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, YukkuriprojectMod.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<DonaldMagic>> DONALD_MAGIC = REGISTRY.register("donald_magic", () -> EntityType.Builder.<DonaldMagic>of(DonaldMagic::new, MobCategory.MISC).build("donald_magic"));
}
