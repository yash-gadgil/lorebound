package com.jackydoge.lorebound.datagen;

import com.jackydoge.lorebound.Lorebound;
import com.jackydoge.lorebound.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {

    private static final LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Lorebound.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.DORMANT_FATE_CORE.get());
        basicItem(ModItems.AWAKENED_FATE_CORE.get());

        basicItem(ModItems.TABLET_GLYPH_Z.get());
        basicItem(ModItems.TABLET_GLYPH_Y.get());
        basicItem(ModItems.TABLET_GLYPH_X.get());
        basicItem(ModItems.TABLET_GLYPH_W.get());
        basicItem(ModItems.TABLET_GLYPH_V.get());
        basicItem(ModItems.TABLET_GLYPH_U.get());
        basicItem(ModItems.TABLET_GLYPH_T.get());
        basicItem(ModItems.TABLET_GLYPH_S.get());
        basicItem(ModItems.TABLET_GLYPH_R.get());
        basicItem(ModItems.TABLET_GLYPH_Q.get());
        basicItem(ModItems.TABLET_GLYPH_P.get());
        basicItem(ModItems.TABLET_GLYPH_O.get());
        basicItem(ModItems.TABLET_GLYPH_N.get());
        basicItem(ModItems.TABLET_GLYPH_M.get());
        basicItem(ModItems.TABLET_GLYPH_L.get());
        basicItem(ModItems.TABLET_GLYPH_K.get());
        basicItem(ModItems.TABLET_GLYPH_J.get());
        basicItem(ModItems.TABLET_GLYPH_I.get());
        basicItem(ModItems.TABLET_GLYPH_H.get());
        basicItem(ModItems.TABLET_GLYPH_G.get());
        basicItem(ModItems.TABLET_GLYPH_F.get());
        basicItem(ModItems.TABLET_GLYPH_E.get());
        basicItem(ModItems.TABLET_GLYPH_D.get());
        basicItem(ModItems.TABLET_GLYPH_C.get());
        basicItem(ModItems.TABLET_GLYPH_B.get());
        basicItem(ModItems.TABLET_GLYPH_A.get());


    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Lorebound.MOD_ID,"item/" + item.getId().getPath()));
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = Lorebound.MOD_ID;

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

}
