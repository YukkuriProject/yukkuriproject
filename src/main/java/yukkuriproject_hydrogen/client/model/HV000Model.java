package yukkuriproject_hydrogen.client.model;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import yukkuriproject_hydrogen.YukkuriprojectMod;


@OnlyIn(Dist.CLIENT)
public class HV000Model<T extends Entity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(YukkuriprojectMod.MODID, "hv_000"), "main");
    private final ModelPart root;

    public HV000Model(ModelPart root) {
        this.root = root;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("cube", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, 12.0F, -12.0F, 16.0F, 8.0F, 24.0F), PartPose.ZERO);
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void setupAnim(T entity, float p_103832_, float p_103833_, float p_103834_, float p_103835_, float p_103836_) {
    }

    @Override
    public ModelPart root() {
            return this.root;
        }
}
