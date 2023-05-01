package mod.absurg.donutmod.item;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
public class HoneyDonut extends Item {
    public HoneyDonut() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .food(new Food.Builder()
                        .saturationMod(6)
                        .nutrition(8)
                        .build())
        );
    }
}