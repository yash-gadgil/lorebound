package com.jackydoge.lorebound.item;

import com.jackydoge.lorebound.Lorebound;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Lorebound.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LOREBOUND = CREATIVE_MOD_TABS.register("lorebound",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.AWAKENED_FATE_CORE.get()))
                    .title(Component.translatable("creativetab.lorebound.lorebound"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DORMANT_FATE_CORE.get());
                        output.accept(ModItems.AWAKENED_FATE_CORE.get());

                        output.accept(ModItems.TABLET_GLYPH_Z.get());
                        output.accept(ModItems.TABLET_GLYPH_Y.get());
                        output.accept(ModItems.TABLET_GLYPH_X.get());
                        output.accept(ModItems.TABLET_GLYPH_W.get());
                        output.accept(ModItems.TABLET_GLYPH_V.get());
                        output.accept(ModItems.TABLET_GLYPH_U.get());
                        output.accept(ModItems.TABLET_GLYPH_T.get());
                        output.accept(ModItems.TABLET_GLYPH_S.get());
                        output.accept(ModItems.TABLET_GLYPH_R.get());
                        output.accept(ModItems.TABLET_GLYPH_Q.get());
                        output.accept(ModItems.TABLET_GLYPH_P.get());
                        output.accept(ModItems.TABLET_GLYPH_O.get());
                        output.accept(ModItems.TABLET_GLYPH_N.get());
                        output.accept(ModItems.TABLET_GLYPH_M.get());
                        output.accept(ModItems.TABLET_GLYPH_L.get());
                        output.accept(ModItems.TABLET_GLYPH_K.get());
                        output.accept(ModItems.TABLET_GLYPH_J.get());
                        output.accept(ModItems.TABLET_GLYPH_I.get());
                        output.accept(ModItems.TABLET_GLYPH_H.get());
                        output.accept(ModItems.TABLET_GLYPH_G.get());
                        output.accept(ModItems.TABLET_GLYPH_F.get());
                        output.accept(ModItems.TABLET_GLYPH_E.get());
                        output.accept(ModItems.TABLET_GLYPH_D.get());
                        output.accept(ModItems.TABLET_GLYPH_C.get());
                        output.accept(ModItems.TABLET_GLYPH_B.get());
                        output.accept(ModItems.TABLET_GLYPH_A.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}