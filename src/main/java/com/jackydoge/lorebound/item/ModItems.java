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

    public static final RegistryObject<Item> TABLET_GLYPH_Z = ITEMS.register("tablet_glyph_z",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_Y = ITEMS.register("tablet_glyph_y",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_X = ITEMS.register("tablet_glyph_x",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_W = ITEMS.register("tablet_glyph_w",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_V = ITEMS.register("tablet_glyph_v",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_U = ITEMS.register("tablet_glyph_u",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_T = ITEMS.register("tablet_glyph_t",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_S = ITEMS.register("tablet_glyph_s",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_R = ITEMS.register("tablet_glyph_r",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_Q = ITEMS.register("tablet_glyph_q",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_P = ITEMS.register("tablet_glyph_p",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_O = ITEMS.register("tablet_glyph_o",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_N = ITEMS.register("tablet_glyph_n",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_M = ITEMS.register("tablet_glyph_m",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_L = ITEMS.register("tablet_glyph_l",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_K = ITEMS.register("tablet_glyph_k",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_J = ITEMS.register("tablet_glyph_j",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_I = ITEMS.register("tablet_glyph_i",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_H = ITEMS.register("tablet_glyph_h",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_G = ITEMS.register("tablet_glyph_g",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_F = ITEMS.register("tablet_glyph_f",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_E = ITEMS.register("tablet_glyph_e",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_D = ITEMS.register("tablet_glyph_d",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_C = ITEMS.register("tablet_glyph_c",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_B = ITEMS.register("tablet_glyph_b",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET_GLYPH_A = ITEMS.register("tablet_glyph_a",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
