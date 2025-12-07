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
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}