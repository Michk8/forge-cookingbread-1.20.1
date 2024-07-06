package net.michk.cookingbread.item;

import net.michk.cookingbread.CookingBread;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CookingBread.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COOKINGBREAD_TAB = CREATIVE_MODE_TABS.register("cookingbread_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DOUGH_BREAD.get()))
                    .title(Component.translatable("creativetab.cookingbread_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DOUGH_BREAD.get());
                        output.accept(Items.BREAD);


                        output.accept(ModItems.SANDWICH_APPLE.get());
                        output.accept(ModItems.SANDWICH_CHORUS_FRUIT.get());
                        output.accept(ModItems.SANDWICH_COD.get());
                        output.accept(ModItems.SANDWICH_COOKED_BEEF.get());
                        output.accept(ModItems.SANDWICH_COOKED_CHICKEN.get());
                        output.accept(ModItems.SANDWICH_COOKED_COD.get());
                        output.accept(ModItems.SANDWICH_COOKED_MUTTON.get());
                        output.accept(ModItems.SANDWICH_COOKED_PORKCHOP.get());
                        output.accept(ModItems.SANDWICH_COOKED_RABBIT.get());
                        output.accept(ModItems.SANDWICH_COOKED_SALMON.get());
                        output.accept(ModItems.SANDWICH_COOKIE.get());
                        output.accept(ModItems.SANDWICH_DRIED_KELP.get());
                        output.accept(ModItems.SANDWICH_ENCHANTED_GOLDEN_APPLE.get());
                        output.accept(ModItems.SANDWICH_GOLDEN_APPLE.get());
                        output.accept(ModItems.SANDWICH_GOLDEN_CARROT.get());
                        output.accept(ModItems.SANDWICH_HONEY.get());
                        output.accept(ModItems.SANDWICH_MELON_SLICE.get());
                        output.accept(ModItems.SANDWICH_MUTTON.get());
                        output.accept(ModItems.SANDWICH_POISONOUS_POTATO.get());
                        output.accept(ModItems.SANDWICH_PORKCHOP.get());
                        output.accept(ModItems.SANDWICH_POTATO.get());
                        output.accept(ModItems.SANDWICH_PUFFERFISH.get());
                        output.accept(ModItems.SANDWICH_PUMPKIN_PIE.get());
                        output.accept(ModItems.SANDWICH_RABBIT.get());
                        output.accept(ModItems.SANDWICH_ROTTEN_FLESH .get());
                        output.accept(ModItems.SANDWICH_SALMON.get());
                        output.accept(ModItems.SANDWICH_SPIDER_EYE.get());
                        output.accept(ModItems.SANDWICH_SWEET_BERRIES.get());
                        output.accept(ModItems.SANDWICH_GLOW_BERRIES.get());
                        output.accept(ModItems.SANDWICH_TROPICAL_FISH.get());
                        output.accept(ModItems.SANDWICH_CARROT.get());
                        output.accept(ModItems.SANDWICH_BEETROOT.get());
                        output.accept(ModItems.SANDWICH_BEEF.get());
                        output.accept(ModItems.SANDWICH_BAKED_POTATO.get());
                        output.accept(ModItems.SANDWICH_APPLE.get());
                        output.accept(ModItems.SANDWICH_EGGS.get());

                        output.accept(ModItems.GRILLED_SANDWICH_BEEF.get());
                        output.accept(ModItems.GRILLED_SANDWICH_CHICKEN.get());
                        output.accept(ModItems.GRILLED_SANDWICH_COD.get());
                        output.accept(ModItems.GRILLED_SANDWICH_MUTTON.get());
                        output.accept(ModItems.GRILLED_SANDWICH_PORKCHOP.get());
                        output.accept(ModItems.GRILLED_SANDWICH_RABBIT.get());
                        output.accept(ModItems.GRILLED_SANDWICH_SALMON.get());
                        output.accept(ModItems.GRILLED_SANDWICH_POTATO.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
