package mod.absurg.donutmod.item;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
public class PowderedSugarDonut extends Item {
    public PowderedSugarDonut() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .food(new Food.Builder()
                        .saturationMod(5.2f)
                        .nutrition(6)
                        .build())
        );
    }
}