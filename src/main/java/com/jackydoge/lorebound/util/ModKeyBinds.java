package com.jackydoge.lorebound.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

public class ModKeyBinds {

    public static KeyMapping openQuests;

    public static void registerKeybinds(RegisterKeyMappingsEvent event) {
        openQuests = new KeyMapping( "key.lorebound.open_quests",
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_M,
                "key.categories.lorebound");

        event.register(openQuests);
    }
}
