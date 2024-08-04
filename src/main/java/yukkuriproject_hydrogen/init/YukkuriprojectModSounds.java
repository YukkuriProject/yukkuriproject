package yukkuriproject_hydrogen.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import yukkuriproject_hydrogen.YukkuriprojectMod;

public class YukkuriprojectModSounds {
    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, YukkuriprojectMod.MODID);

    public static final DeferredHolder<SoundEvent, SoundEvent> DONALD_MAGIC = registerSoundEvents("donald_magic");

    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvents(String name) {
        return REGISTRY.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(YukkuriprojectMod.MODID, name)));
    }
}
