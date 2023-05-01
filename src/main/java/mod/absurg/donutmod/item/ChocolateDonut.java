package mod.absurg.donutmod.item;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;

public class ChocolateDonut extends Item {
    public ChocolateDonut() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .food(new Food.Builder()
                        .saturationMod(7)
                        .nutrition(7)
                        .build())
        );
    }
}