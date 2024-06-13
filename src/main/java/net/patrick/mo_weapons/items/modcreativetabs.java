package net.patrick.mo_weapons.items;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.patrick.mo_weapons.mo_weapons;

public class modcreativetabs {
    public static final DeferredRegister<CreativeModeTab> moded_creative_tab =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB,mo_weapons.MOD_ID);

    public  static  final RegistryObject<CreativeModeTab> creative_mod_tab =
            moded_creative_tab.register("random_stuff",
                    () -> CreativeModeTab.builder().icon(() ->new ItemStack(moditems.METAL_BALL.get()))
                            .title(Component.translatable("creativetab.random_stuff"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(moditems.obj.get());
                                pOutput.accept(moditems.METAL_BALL.get());
                                pOutput.accept(moditems.a_sword.get());
                               })
                            .build());

    public static void register(IEventBus eventbus){
        moded_creative_tab.register(eventbus);
    }
}
