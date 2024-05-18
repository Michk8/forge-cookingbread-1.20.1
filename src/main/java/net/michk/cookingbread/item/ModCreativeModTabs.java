package net.michk.cookingbread.item;

import net.michk.cookingbread.CookingBread;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
                        output.accept(ModItems.TESTSANDWITCH.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
