package net.michk.cookingbread;

import com.mojang.logging.LogUtils;
import net.michk.cookingbread.item.ModCreativeModTabs;
import net.michk.cookingbread.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CookingBread.MOD_ID)
public class CookingBread
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "cookingbread";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public CookingBread()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.DOUGH_BREAD);

            event.accept(ModItems.SANDWICH_CHICKEN);
            event.accept(ModItems.SANDWICH_CHORUS_FRUIT);
            event.accept(ModItems.SANDWICH_COD);
            event.accept(ModItems.SANDWICH_COOKED_BEEF);
            event.accept(ModItems.SANDWICH_COOKED_CHICKEN);
            event.accept(ModItems.SANDWICH_COOKED_COD);
            event.accept(ModItems.SANDWICH_COOKED_MUTTON);
            event.accept(ModItems.SANDWICH_COOKED_PORKCHOP);
            event.accept(ModItems.SANDWICH_COOKED_RABBIT);
            event.accept(ModItems.SANDWICH_COOKED_SALMON);
            event.accept(ModItems.SANDWICH_COOKIE);
            event.accept(ModItems.SANDWICH_DRIED_KELP);
            event.accept(ModItems.SANDWICH_ENCHANTED_GOLDEN_APPLE);
            event.accept(ModItems.SANDWICH_GOLDEN_APPLE);
            event.accept(ModItems.SANDWICH_GOLDEN_CARROT);
            event.accept(ModItems.SANDWICH_HONEY);
            event.accept(ModItems.SANDWICH_MELON_SLICE);
            event.accept(ModItems.SANDWICH_MUTTON);
            event.accept(ModItems.SANDWICH_POISONOUS_POTATO);
            event.accept(ModItems.SANDWICH_PORKCHOP);
            event.accept(ModItems.SANDWICH_POTATO);
            event.accept(ModItems.SANDWICH_PUFFERFISH);
            event.accept(ModItems.SANDWICH_PUMPKIN_PIE);
            event.accept(ModItems.SANDWICH_RABBIT);
            event.accept(ModItems.SANDWICH_ROTTEN_FLESH);
            event.accept(ModItems.SANDWICH_SALMON);
            event.accept(ModItems.SANDWICH_SPIDER_EYE);
            event.accept(ModItems.SANDWICH_SWEET_BERRIES);
            event.accept(ModItems.SANDWICH_GLOW_BERRIES);
            event.accept(ModItems.SANDWICH_TROPICAL_FISH);
            event.accept(ModItems.SANDWICH_CARROT);
            event.accept(ModItems.SANDWICH_BEETROOT);
            event.accept(ModItems.SANDWICH_BEEF);
            event.accept(ModItems.SANDWICH_BAKED_POTATO);
            event.accept(ModItems.SANDWICH_APPLE);
            event.accept(ModItems.SANDWICH_EGGS);

            event.accept(ModItems.GRILLED_SANDWICH_BEEF);
            event.accept(ModItems.GRILLED_SANDWICH_COD);
            event.accept(ModItems.GRILLED_SANDWICH_CHICKEN);
            event.accept(ModItems.GRILLED_SANDWICH_MUTTON);
            event.accept(ModItems.GRILLED_SANDWICH_PORKCHOP);
            event.accept(ModItems.GRILLED_SANDWICH_RABBIT);
            event.accept(ModItems.GRILLED_SANDWICH_SALMON);
            event.accept(ModItems.GRILLED_SANDWICH_POTATO);


        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
