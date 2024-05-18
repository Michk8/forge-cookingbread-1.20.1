package net.michk.cookingbread.item;

import net.michk.cookingbread.CookingBread;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CookingBread.MOD_ID);

    public static final RegistryObject<Item> DOUGH_BREAD = ITEMS.register("dough_bread",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TESTSANDWITCH = ITEMS.register("testsandwitch",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
