package net.patrick.mo_weapons.items.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.Level;

public class bloodsword extends SwordItem {
    public bloodsword(Properties props){
        super(Tiers.NETHERITE,7,1,props);

    }
    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
            pTarget.addEffect(new MobEffectInstance(MobEffects.HARM, 300), pAttacker);
            System.out.println(pAttacker.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 500, 0, false, false, true)));



        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }



}
