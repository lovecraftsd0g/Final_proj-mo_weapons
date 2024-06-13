package net.patrick.mo_weapons.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.patrick.mo_weapons.mo_weapons;

public class modtags {
    public static class Items{
        private static TagKey<Item> tagitem(String name){
            return ItemTags.create(new ResourceLocation(mo_weapons.MOD_ID,name));
        }
    }
}
