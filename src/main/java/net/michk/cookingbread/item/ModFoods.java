package net.michk.cookingbread.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SANDWICH_CHICKEN = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build();
    public static final FoodProperties SANDWICH_CHORUS_FRUIT = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_COD = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_COOKED_BEEF = (new FoodProperties.Builder()).nutrition(13).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_COOKED_CHICKEN = (new FoodProperties.Builder()).nutrition(11).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_COOKED_COD = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_COOKED_MUTTON = (new FoodProperties.Builder()).nutrition(11).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_COOKED_PORKCHOP = (new FoodProperties.Builder()).nutrition(13).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_COOKED_RABBIT = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_COOKED_SALMON = (new FoodProperties.Builder()).nutrition(11).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_COOKIE = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_DRIED_KELP = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_ENCHANTED_GOLDEN_APPLE = (new FoodProperties.Builder()).nutrition(9).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0), 1.0F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1.0F).alwaysEat().build();
    public static final FoodProperties SANDWICH_GOLDEN_APPLE = (new FoodProperties.Builder()).nutrition(9).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).alwaysEat().build();
    public static final FoodProperties SANDWICH_GOLDEN_CARROT = (new FoodProperties.Builder()).nutrition(11).saturationMod(1.2F).build();
    public static final FoodProperties SANDWICH_HONEY = (new FoodProperties.Builder()).nutrition(11).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_MELON_SLICE = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_MUTTON = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).meat().build();
    public static final FoodProperties SANDWICH_POISONOUS_POTATO = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.POISON, 100, 0), 0.6F).build();
    public static final FoodProperties SANDWICH_PORKCHOP = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_POTATO = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_PUFFERFISH = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.POISON, 1200, 1), 1.0F).effect(new MobEffectInstance(MobEffects.HUNGER, 300, 2), 1.0F).effect(new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 1.0F).build();
    public static final FoodProperties SANDWICH_PUMPKIN_PIE = (new FoodProperties.Builder()).nutrition(13).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_RABBIT = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).meat().build();
    public static final FoodProperties SANDWICH_ROTTEN_FLESH = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).build();
    public static final FoodProperties SANDWICH_SALMON = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_SPIDER_EYE = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.POISON, 100, 0), 1.0F).build();
    public static final FoodProperties SANDWICH_SWEET_BERRIES = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_GLOW_BERRIES = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_TROPICAL_FISH = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_CARROT = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_BEETROOT = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_BEEF = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_BAKED_POTATO = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_APPLE = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.6F).build();
    public static final FoodProperties SANDWICH_EGGS =  (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).build();


    public static final FoodProperties GRILLED_SANDWICH_BEEF = (new FoodProperties.Builder()).nutrition(15).saturationMod(0.6F).build();
    public static final FoodProperties GRILLED_SANDWICH_CHICKEN = (new FoodProperties.Builder()).nutrition(13).saturationMod(0.6F).build();
    public static final FoodProperties GRILLED_SANDWICH_COD = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.6F).build();
    public static final FoodProperties GRILLED_SANDWICH_MUTTON = (new FoodProperties.Builder()).nutrition(13).saturationMod(0.6F).build();
    public static final FoodProperties GRILLED_SANDWICH_PORKCHOP = (new FoodProperties.Builder()).nutrition(15).saturationMod(0.6F).build();
    public static final FoodProperties GRILLED_SANDWICH_RABBIT = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.6F).build();
    public static final FoodProperties GRILLED_SANDWICH_SALMON = (new FoodProperties.Builder()).nutrition(13).saturationMod(0.6F).build();
    public static final FoodProperties GRILLED_SANDWICH_POTATO = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.6F).build();







}
