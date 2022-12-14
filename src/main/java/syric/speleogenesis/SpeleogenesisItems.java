package syric.speleogenesis;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import syric.speleogenesis.lush.LushSeedItem;

public class SpeleogenesisItems {
    // create DeferredRegister object
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Speleogenesis.MODID);

    static void register(IEventBus bus) {
        ITEMS.register(bus);
    }


    // register items
    public static final RegistryObject<Item> LUSH_SEED = ITEMS.register("lush_seed",
            () -> new LushSeedItem(new Item.Properties().stacksTo(16).tab(ItemGroup.TAB_MISC).rarity(Rarity.UNCOMMON)));

}
