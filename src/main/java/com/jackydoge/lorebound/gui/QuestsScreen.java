package com.jackydoge.lorebound.gui;

import com.jackydoge.lorebound.gui.components.QuestTab;
import com.jackydoge.lorebound.util.ModKeyBinds;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.layouts.HeaderAndFooterLayout;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

public class QuestsScreen extends Screen {

    private static final ResourceLocation INV_BACKGROUND = ResourceLocation.fromNamespaceAndPath("minecraft", "textures/gui/advancements/window.png");

    private final int WINDOW_WIDTH = 252;
    private final int WINDOW_HEIGHT = 140;
    public static final int WINDOW_INSIDE_WIDTH = 234;
    public static final int WINDOW_INSIDE_HEIGHT = 113;
    private static final Component TITLE = Component.translatable("gui.quests");
    private final HeaderAndFooterLayout layout = new HeaderAndFooterLayout(this);
    @Nullable
    private QuestTab selectedTab;



    public QuestsScreen() {
        super(TITLE);
    }

    @Override
    protected void init() {
        this.layout.addTitleHeader(TITLE, this.font);
        this.layout.addToFooter(Button.builder(CommonComponents.GUI_DONE, p_329618_ -> this.onClose()).width(200).build());
        this.layout.arrangeElements();
    }

    @Override
    public void render(GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {

        RenderSystem.enableBlend();

        //pGuiGraphics.fill((this.width - GUI_WIDTH) / 2, (this.height - GUI_HEIGHT) / 2,  (this.width + GUI_WIDTH) / 2 , (this.height + GUI_HEIGHT) / 2, 0xFF444444);
        this.renderBackground(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
        super.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
    }
    @Override
    public boolean keyPressed(int pKeyCode, int pScanCode, int pModifiers) {
        if (ModKeyBinds.openQuests.matches(pKeyCode, pScanCode)) {
            assert this.minecraft != null;
            this.minecraft.setScreen(null);
            this.minecraft.mouseHandler.grabMouse();
            return true;
        } else {
            return super.keyPressed(pKeyCode, pScanCode, pModifiers);
        }
    }

    @Override
    public void renderBackground(GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {


        pGuiGraphics.blit(INV_BACKGROUND, (this.width - WINDOW_WIDTH) / 2, (this.height - WINDOW_HEIGHT) / 2, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        //super.renderBackground(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
    }
}
