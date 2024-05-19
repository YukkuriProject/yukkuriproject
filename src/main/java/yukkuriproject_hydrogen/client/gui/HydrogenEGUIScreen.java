package yukkuriproject_hydrogen.client.gui;

import yukkuriproject_hydrogen.world.inventory.HydrogenEGUIMenu;

import yukkuriproject_hydrogen.network.HydrogenEGUIButtonMessage;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HydrogenEGUIScreen extends AbstractContainerScreen<HydrogenEGUIMenu> {
	private final static HashMap<String, Object> guistate = HydrogenEGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_extraction;

	public HydrogenEGUIScreen(HydrogenEGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("yukkuriproject:textures/screens/hydrogen_egui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.yukkuriproject.hydrogen_egui.label_water_extraction_machine"), 6, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.yukkuriproject.hydrogen_egui.label_hydrogen"), 64, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.yukkuriproject.hydrogen_egui.label_magma"), 24, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.yukkuriproject.hydrogen_egui.label_bottle"), 128, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.yukkuriproject.hydrogen_egui.label_redstone"), 8, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.yukkuriproject.hydrogen_egui.label_piston"), 128, 43, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_extraction = Button.builder(Component.translatable("gui.yukkuriproject.hydrogen_egui.button_extraction"), e -> {
			if (true) {
				PacketDistributor.SERVER.noArg().send(new HydrogenEGUIButtonMessage(0, x, y, z));
				HydrogenEGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 48, this.topPos + 61, 77, 20).build();
		guistate.put("button:button_extraction", button_extraction);
		this.addRenderableWidget(button_extraction);
	}
}
