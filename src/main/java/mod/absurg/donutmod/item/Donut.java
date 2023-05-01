package mod.absurg.donutmod.item;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;
public class Donut extends Item {
    public Donut() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .food(new Food.Builder()
                        .saturationMod(5)
                        .nutrition(5)
                        .build())
        );
    }
}
