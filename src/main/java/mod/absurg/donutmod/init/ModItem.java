package mod.absurg.donutmod.init;

import mod.absurg.donutmod.DonutMod;
import mod.absurg.donutmod.item.*;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DonutMod.MOD_ID);

    public static final RegistryObject<Item> DONUT_DOUGH = ITEMS.register("donut_dough",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    //public static final RegistryObject<Item> BERRY_DONUT = ITEMS.register("berry_donut", BerryDonut::new);
    public static final RegistryObject<Item> DONUT = ITEMS.register("donut", Donut::new);
    public static final RegistryObject<Item> POWDERED_SUGAR_DONUT = ITEMS.register("powdered_sugar_donut", PowderedSugarDonut::new);
    public static final RegistryObject<Item> GLAZED_DONUT = ITEMS.register("glazed_donut", GlazedDonut::new);
    public static final RegistryObject<Item> BERRY_DONUT = ITEMS.register("berry_donut", BerryDonut::new);
    public static final RegistryObject<Item> CARAMEL_DONUT = ITEMS.register("caramel_donut", CaramelDonut::new);
    public static final RegistryObject<Item> CHOCOLATE_DONUT = ITEMS.register("chocolate_donut", ChocolateDonut::new);
    public static final RegistryObject<Item> HONEY_DONUT = ITEMS.register("honey_donut", HoneyDonut::new);
    public static final RegistryObject<Item> GLOWING_DONUT = ITEMS.register("glowing_donut", GlowingDonut::new);
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
