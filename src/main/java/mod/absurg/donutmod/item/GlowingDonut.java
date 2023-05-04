package mod.absurg.donutmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
public class GlowingDonut extends Item {
    public GlowingDonut() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .food(new Food.Builder()
                        .saturationMod(5.3f)
                        .nutrition(6)
                        .alwaysEat()
                        .effect(() -> new EffectInstance
                                (Effects.NIGHT_VISION, 3600, 0), 1).build())
        );
    }
}