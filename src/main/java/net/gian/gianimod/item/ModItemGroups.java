package net.gian.gianimod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gian.gianimod.Gianimod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BONKSTICK = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Gianimod.MOD_ID, "bonkstick_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BONKSTICK_SWORD))
                    .displayName(Text.translatable("itemgroup.gianimod.bonkstick_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BONKSTICK_SWORD);
                    }).build());

    public static void registerItemGroups() {
        Gianimod.LOGGER.info("Registering Item Groups for " + Gianimod.MOD_ID);
    }
}