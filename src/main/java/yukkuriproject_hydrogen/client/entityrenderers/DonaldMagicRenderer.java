package yukkuriproject_hydrogen.client.entityrenderers;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.TntRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.item.PrimedTnt;
import yukkuriproject_hydrogen.entities.DonaldMagic;
import yukkuriproject_hydrogen.init.YukkuriprojectModBlocks;

public class DonaldMagicRenderer extends EntityRenderer<DonaldMagic> {
    BlockRenderDispatcher blockRenderer;

    public DonaldMagicRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.shadowRadius = 0;
        this.blockRenderer = context.getBlockRenderDispatcher();
    }

    @Override
    public void render(DonaldMagic entity, float yaw, float tickDelta, PoseStack poseStack, MultiBufferSource buffer, int light) {
        poseStack.pushPose();
        poseStack.translate(0, 0.5f, 0);
        this.blockRenderer.renderSingleBlock(YukkuriprojectModBlocks.DONALD_BLOCK.get().defaultBlockState(), poseStack, buffer, light, OverlayTexture.NO_OVERLAY);
        poseStack.popPose();
        super.render(entity, yaw, tickDelta, poseStack, buffer, light);
    }

    @Override
    public ResourceLocation getTextureLocation(DonaldMagic entity) {
        return TextureAtlas.LOCATION_BLOCKS;
    }
}
