
package yukkuriproject_hydrogen.client.renderer;

import yukkuriproject_hydrogen.entity.HV000Entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

public class HV000Renderer extends MobRenderer<HV000Entity, SlimeModel<HV000Entity>> {
	public HV000Renderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HV000Entity entity) {
		return new ResourceLocation("yukkuriproject:textures/entities/230506_teloport_staff.png");
	}
}
