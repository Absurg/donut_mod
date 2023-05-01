package mod.absurg.donutmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;

public class BerryDonut extends Item {
    public BerryDonut() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .food(new Food.Builder()
                        .saturationMod(5.3f)
                        .nutrition(8)
                        .build())
        );
    }
}