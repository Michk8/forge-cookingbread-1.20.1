package net.michk.cookingbread.item;

import net.michk.cookingbread.CookingBread;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CookingBread.MOD_ID);

    public static final RegistryObject<Item> DOUGH_BREAD = ITEMS.register("dough_bread",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SANDWICH_CHICKEN = ITEMS.register("sandwich_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_CHICKEN)));
    public static final RegistryObject<Item> SANDWICH_CHORUS_FRUIT = ITEMS.register("sandwich_chorus_fruit",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_CHORUS_FRUIT)));
    public static final RegistryObject<Item> SANDWICH_COD = ITEMS.register("sandwich_cod",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_COD)));
    public static final RegistryObject<Item> SANDWICH_COOKED_BEEF = ITEMS.register("sandwich_cooked_beef",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_COOKED_BEEF)));
    public static final RegistryObject<Item> SANDWICH_COOKED_CHICKEN = ITEMS.register("sandwich_cooked_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_COOKED_CHICKEN)));
    public static final RegistryObject<Item> SANDWICH_COOKED_COD = ITEMS.register("sandwich_cooked_cod",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_COOKED_COD)));
    public static final RegistryObject<Item> SANDWICH_COOKED_MUTTON = ITEMS.register("sandwich_cooked_mutton",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_COOKED_MUTTON)));
    public static final RegistryObject<Item> SANDWICH_COOKED_PORKCHOP = ITEMS.register("sandwich_cooked_porkchop",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_COOKED_PORKCHOP)));
    public static final RegistryObject<Item> SANDWICH_COOKED_RABBIT = ITEMS.register("sandwich_cooked_rabbit",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_COOKED_RABBIT)));
    public static final RegistryObject<Item> SANDWICH_COOKED_SALMON = ITEMS.register("sandwich_cooked_salmon",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_COOKED_SALMON)));
    public static final RegistryObject<Item> SANDWICH_COOKIE = ITEMS.register("sandwich_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_COOKIE)));
    public static final RegistryObject<Item> SANDWICH_DRIED_KELP = ITEMS.register("sandwich_dried_kelp",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_DRIED_KELP)));
    public static final RegistryObject<Item> SANDWICH_ENCHANTED_GOLDEN_APPLE = ITEMS.register("sandwich_enchanted_golden_apple",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_ENCHANTED_GOLDEN_APPLE)));
    public static final RegistryObject<Item> SANDWICH_GOLDEN_APPLE = ITEMS.register("sandwich_golden_apple",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_GOLDEN_APPLE)));
    public static final RegistryObject<Item> SANDWICH_GOLDEN_CARROT = ITEMS.register("sandwich_golden_carrot",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_GOLDEN_CARROT)));
    public static final RegistryObject<Item> SANDWICH_HONEY = ITEMS.register("sandwich_honey",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_HONEY)));
    public static final RegistryObject<Item> SANDWICH_MELON_SLICE = ITEMS.register("sandwich_melon_slice",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_MELON_SLICE)));
    public static final RegistryObject<Item> SANDWICH_MUTTON = ITEMS.register("sandwich_mutton",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_MUTTON)));
    public static final RegistryObject<Item> SANDWICH_POISONOUS_POTATO = ITEMS.register("sandwich_poisonous_potato",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_POISONOUS_POTATO)));
    public static final RegistryObject<Item> SANDWICH_PORKCHOP = ITEMS.register("sandwich_porkchop",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_PORKCHOP)));
    public static final RegistryObject<Item> SANDWICH_POTATO = ITEMS.register("sandwich_potato",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_POTATO)));
    public static final RegistryObject<Item> SANDWICH_PUFFERFISH = ITEMS.register("sandwich_pufferfish",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_PUFFERFISH)));
    public static final RegistryObject<Item> SANDWICH_PUMPKIN_PIE = ITEMS.register("sandwich_pumpkin_pie",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_PUMPKIN_PIE)));
    public static final RegistryObject<Item> SANDWICH_RABBIT = ITEMS.register("sandwich_rabbit",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_RABBIT)));
    public static final RegistryObject<Item> SANDWICH_ROTTEN_FLESH = ITEMS.register("sandwich_rotten_flesh",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_ROTTEN_FLESH)));
    public static final RegistryObject<Item> SANDWICH_SALMON = ITEMS.register("sandwich_salmon",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_SALMON)));
    public static final RegistryObject<Item> SANDWICH_SPIDER_EYE = ITEMS.register("sandwich_spider_eye",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_SPIDER_EYE)));
    public static final RegistryObject<Item> SANDWICH_SWEET_BERRIES = ITEMS.register("sandwich_sweet_berries",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_SWEET_BERRIES)));
    public static final RegistryObject<Item> SANDWICH_GLOW_BERRIES = ITEMS.register("sandwich_glow_berries",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_GLOW_BERRIES)));
    public static final RegistryObject<Item> SANDWICH_TROPICAL_FISH = ITEMS.register("sandwich_tropical_fish",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_TROPICAL_FISH)));
    public static final RegistryObject<Item> SANDWICH_CARROT = ITEMS.register("sandwich_carrot",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_CARROT)));
    public static final RegistryObject<Item> SANDWICH_BEETROOT = ITEMS.register("sandwich_beetroot",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_BEETROOT)));
    public static final RegistryObject<Item> SANDWICH_BEEF = ITEMS.register("sandwich_beef",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_BEEF)));
    public static final RegistryObject<Item> SANDWICH_BAKED_POTATO = ITEMS.register("sandwich_baked_potato",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_BAKED_POTATO)));
    public static final RegistryObject<Item> SANDWICH_APPLE = ITEMS.register("sandwich_apple",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_APPLE)));
    public static final RegistryObject<Item> SANDWICH_EGGS = ITEMS.register("sandwich_eggs",
            () -> new Item(new Item.Properties().food(ModFoods.SANDWICH_EGGS)));


    public static final RegistryObject<Item> GRILLED_SANDWICH_BEEF = ITEMS.register("grilled_sandwich_beef",
            () -> new Item(new Item.Properties().food(ModFoods.GRILLED_SANDWICH_BEEF)));
    public static final RegistryObject<Item> GRILLED_SANDWICH_CHICKEN = ITEMS.register("grilled_sandwich_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.GRILLED_SANDWICH_CHICKEN)));
    public static final RegistryObject<Item> GRILLED_SANDWICH_COD = ITEMS.register("grilled_sandwich_cod",
            () -> new Item(new Item.Properties().food(ModFoods.GRILLED_SANDWICH_COD)));
    public static final RegistryObject<Item> GRILLED_SANDWICH_MUTTON = ITEMS.register("grilled_sandwich_mutton",
            () -> new Item(new Item.Properties().food(ModFoods.GRILLED_SANDWICH_MUTTON)));
    public static final RegistryObject<Item> GRILLED_SANDWICH_PORKCHOP = ITEMS.register("grilled_sandwich_porkchop",
            () -> new Item(new Item.Properties().food(ModFoods.GRILLED_SANDWICH_PORKCHOP)));
    public static final RegistryObject<Item> GRILLED_SANDWICH_RABBIT = ITEMS.register("grilled_sandwich_rabbit",
            () -> new Item(new Item.Properties().food(ModFoods.GRILLED_SANDWICH_RABBIT)));
    public static final RegistryObject<Item> GRILLED_SANDWICH_SALMON = ITEMS.register("grilled_sandwich_salmon",
            () -> new Item(new Item.Properties().food(ModFoods.GRILLED_SANDWICH_SALMON)));
    public static final RegistryObject<Item> GRILLED_SANDWICH_POTATO = ITEMS.register("grilled_sandwich_potato",
            () -> new Item(new Item.Properties().food(ModFoods.GRILLED_SANDWICH_POTATO)));




    public static final RegistryObject<Item> DOUGH_BREAD_ROLL = ITEMS.register("dough_bread_roll",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BREAD_ROLL = ITEMS.register("bread_roll",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL)));

    public static final RegistryObject<Item> BREAD_ROLL_CHICKEN = ITEMS.register("bread_roll_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_CHICKEN)));
    public static final RegistryObject<Item> BREAD_ROLL_CHORUS_FRUIT = ITEMS.register("bread_roll_chorus_fruit",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_CHORUS_FRUIT)));
    public static final RegistryObject<Item> BREAD_ROLL_COD = ITEMS.register("bread_roll_cod",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_COD)));
    public static final RegistryObject<Item> BREAD_ROLL_COOKED_BEEF = ITEMS.register("bread_roll_cooked_beef",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_COOKED_BEEF)));
    public static final RegistryObject<Item> BREAD_ROLL_COOKED_CHICKEN = ITEMS.register("bread_roll_cooked_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_COOKED_CHICKEN)));
    public static final RegistryObject<Item> BREAD_ROLL_COOKED_COD = ITEMS.register("bread_roll_cooked_cod",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_COOKED_COD)));
    public static final RegistryObject<Item> BREAD_ROLL_COOKED_MUTTON = ITEMS.register("bread_roll_cooked_mutton",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_COOKED_MUTTON)));
    public static final RegistryObject<Item> BREAD_ROLL_COOKED_PORKCHOP = ITEMS.register("bread_roll_cooked_porkchop",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_COOKED_PORKCHOP)));
    public static final RegistryObject<Item> BREAD_ROLL_COOKED_RABBIT = ITEMS.register("bread_roll_cooked_rabbit",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_COOKED_RABBIT)));
    public static final RegistryObject<Item> BREAD_ROLL_COOKED_SALMON = ITEMS.register("bread_roll_cooked_salmon",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_COOKED_SALMON)));
    public static final RegistryObject<Item> BREAD_ROLL_COOKIE = ITEMS.register("bread_roll_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_COOKIE)));
    public static final RegistryObject<Item> BREAD_ROLL_DRIED_KELP = ITEMS.register("bread_roll_dried_kelp",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_DRIED_KELP)));
    public static final RegistryObject<Item> BREAD_ROLL_ENCHANTED_GOLDEN_APPLE = ITEMS.register("bread_roll_enchanted_golden_apple",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_ENCHANTED_GOLDEN_APPLE)));
    public static final RegistryObject<Item> BREAD_ROLL_GOLDEN_APPLE = ITEMS.register("bread_roll_golden_apple",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_GOLDEN_APPLE)));
    public static final RegistryObject<Item> BREAD_ROLL_GOLDEN_CARROT = ITEMS.register("bread_roll_golden_carrot",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_GOLDEN_CARROT)));
    public static final RegistryObject<Item> BREAD_ROLL_HONEY = ITEMS.register("bread_roll_honey",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_HONEY)));
    public static final RegistryObject<Item> BREAD_ROLL_MELON_SLICE = ITEMS.register("bread_roll_melon_slice",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_MELON_SLICE)));
    public static final RegistryObject<Item> BREAD_ROLL_MUTTON = ITEMS.register("bread_roll_mutton",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_MUTTON)));
    public static final RegistryObject<Item> BREAD_ROLL_POISONOUS_POTATO = ITEMS.register("bread_roll_poisonous_potato",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_POISONOUS_POTATO)));
    public static final RegistryObject<Item> BREAD_ROLL_PORKCHOP = ITEMS.register("bread_roll_porkchop",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_PORKCHOP)));
    public static final RegistryObject<Item> BREAD_ROLL_POTATO = ITEMS.register("bread_roll_potato",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_POTATO)));
    public static final RegistryObject<Item> BREAD_ROLL_PUFFERFISH = ITEMS.register("bread_roll_pufferfish",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_PUFFERFISH)));
    public static final RegistryObject<Item> BREAD_ROLL_PUMPKIN_PIE = ITEMS.register("bread_roll_pumpkin_pie",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_PUMPKIN_PIE)));
    public static final RegistryObject<Item> BREAD_ROLL_RABBIT = ITEMS.register("bread_roll_rabbit",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_RABBIT)));
    public static final RegistryObject<Item> BREAD_ROLL_ROTTEN_FLESH = ITEMS.register("bread_roll_rotten_flesh",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_ROTTEN_FLESH)));
    public static final RegistryObject<Item> BREAD_ROLL_SALMON = ITEMS.register("bread_roll_salmon",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_SALMON)));
    public static final RegistryObject<Item> BREAD_ROLL_SPIDER_EYE = ITEMS.register("bread_roll_spider_eye",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_SPIDER_EYE)));
    public static final RegistryObject<Item> BREAD_ROLL_SWEET_BERRIES = ITEMS.register("bread_roll_sweet_berries",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_SWEET_BERRIES)));
    public static final RegistryObject<Item> BREAD_ROLL_GLOW_BERRIES = ITEMS.register("bread_roll_glow_berries",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_GLOW_BERRIES)));
    public static final RegistryObject<Item> BREAD_ROLL_TROPICAL_FISH = ITEMS.register("bread_roll_tropical_fish",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_TROPICAL_FISH)));
    public static final RegistryObject<Item> BREAD_ROLL_CARROT = ITEMS.register("bread_roll_carrot",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_CARROT)));
    public static final RegistryObject<Item> BREAD_ROLL_BEETROOT = ITEMS.register("bread_roll_beetroot",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_BEETROOT)));
    public static final RegistryObject<Item> BREAD_ROLL_BEEF = ITEMS.register("bread_roll_beef",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_BEEF)));
    public static final RegistryObject<Item> BREAD_ROLL_BAKED_POTATO = ITEMS.register("bread_roll_baked_potato",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_BAKED_POTATO)));
    public static final RegistryObject<Item> BREAD_ROLL_APPLE = ITEMS.register("bread_roll_apple",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_APPLE)));
    public static final RegistryObject<Item> BREAD_ROLL_EGGS = ITEMS.register("bread_roll_eggs",
            () -> new Item(new Item.Properties().food(ModFoods.BREAD_ROLL_EGGS)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
