package net.gian.gianimod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gian.gianimod.Gianimod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BONKSTICK_SWORD = registerItem("bonkstick",
            new SwordItem(ModToolMaterials.BONKSTICK, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BONKSTICK, 3, -2.4f))));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Gianimod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Gianimod.LOGGER.info("Registering Mod Items for " + Gianimod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(BONKSTICK_SWORD);
        });
    }
}
