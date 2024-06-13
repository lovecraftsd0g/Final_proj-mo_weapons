package net.patrick.mo_weapons.items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.patrick.mo_weapons.items.custom.firesword;
import net.patrick.mo_weapons.items.custom.withersword;
import net.patrick.mo_weapons.mo_weapons;

import java.util.LinkedList;

public class moditems {
    private LinkedList<RegistryObject<Item>> mitems = new LinkedList<>();
    public static final DeferredRegister<Item> items =
            DeferredRegister.create(ForgeRegistries.ITEMS, mo_weapons.MOD_ID);
    public static final RegistryObject<Item> obj = items.register("obj",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_BALL = items.register("metal_ball",
            ()-> new Item(new Item.Properties()));
    public  static  final RegistryObject<Item> a_sword = items.register("a_sword",
            ()-> new SwordItem(Tiers.IRON,50,30,new Item.Properties()));
    public  static  final RegistryObject<Item> flamesword = items.register("flame_sword",
            ()-> new firesword(new Item.Properties()));
    public  static  final RegistryObject<Item> withersword = items.register("wither_sword",
            ()-> new withersword(new Item.Properties()));
    public  static  final RegistryObject<Item> bloodsword = items.register("bs",
            ()-> new withersword(new Item.Properties()));
    public moditems(){
        mitems.add(obj);
        mitems.add(METAL_BALL);
        mitems.add(a_sword);
        mitems.add(flamesword);
        mitems.add(withersword);
        mitems.add(bloodsword);
    }

    public  static void register(IEventBus eventbus){
        items.register(eventbus);

    }

    public LinkedList<RegistryObject<Item>> getMitems() {
        return this.mitems;
    }
}
