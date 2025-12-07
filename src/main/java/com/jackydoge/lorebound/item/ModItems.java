package com.jackydoge.lorebound.item;

import com.jackydoge.lorebound.Lorebound;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lorebound.MOD_ID);

    public static final RegistryObject<Item> DORMANT_FATE_CORE = ITEMS.register("dormant_fate_core",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AWAKENED_FATE_CORE = ITEMS.register("awakened_fate_core",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
