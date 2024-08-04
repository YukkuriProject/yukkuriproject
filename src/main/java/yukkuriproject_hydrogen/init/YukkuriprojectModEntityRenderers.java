package yukkuriproject_hydrogen.init;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import yukkuriproject_hydrogen.YukkuriprojectMod;
import yukkuriproject_hydrogen.client.entityrenderers.DonaldMagicRenderer;

@Mod.EventBusSubscriber(modid = YukkuriprojectMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class YukkuriprojectModEntityRenderers {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(YukkuriprojectModEntityTypes.DONALD_MAGIC.get(), DonaldMagicRenderer::new);
    }
}
