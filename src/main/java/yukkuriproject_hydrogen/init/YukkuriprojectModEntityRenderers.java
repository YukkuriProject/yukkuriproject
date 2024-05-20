
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package yukkuriproject_hydrogen.init;

import yukkuriproject_hydrogen.client.model.HV000Model;
import yukkuriproject_hydrogen.client.renderer.HV000Renderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class YukkuriprojectModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(YukkuriprojectModEntities.HV_000.get(), HV000Renderer::new);
	}

	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(HV000Model.LAYER_LOCATION, HV000Model::createOuterBodyLayer);
	}
}
