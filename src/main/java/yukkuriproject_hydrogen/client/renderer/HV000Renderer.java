
package yukkuriproject_hydrogen.client.renderer;

import yukkuriproject_hydrogen.client.model.HV000Model;
import yukkuriproject_hydrogen.entity.HV000Entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;

public class HV000Renderer extends MobRenderer<HV000Entity, HV000Model<HV000Entity>> {
	public HV000Renderer(EntityRendererProvider.Context context) {
		super(context, new HV000Model<>(context.bakeLayer(HV000Model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HV000Entity entity) {
		return new ResourceLocation("yukkuriproject:textures/entities/230506_teloport_staff.png");
	}
}
