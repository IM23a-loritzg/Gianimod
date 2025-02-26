package net.gian.gianimod.util;

import net.gian.gianimod.Gianimod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = createTag("need_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_NETHERITE_TOOL = createTag("incorrect_for_netherite_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Gianimod.MOD_ID, name));
        }
    }
}
