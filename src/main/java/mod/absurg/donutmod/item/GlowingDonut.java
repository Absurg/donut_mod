package mod.absurg.donutmod.item;

import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance; 
import net.minecraft.potion.Effects;
public class GlowingDonut extends Item {
    public GlowingDonut() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .food(new Food.Builder()
                        .saturationMod(5.3f)
                        .nutrition(7)
                        .effect(() -> new EffectInstance
                                (Effects.NIGHT_VISION, 6000, 0), 1).build())
        );
    }
}