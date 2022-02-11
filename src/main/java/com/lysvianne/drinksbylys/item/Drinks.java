package com.lysvianne.drinksbylys.item;

import com.lysvianne.drinksbylys.DrinksByLys;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Drinks {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DrinksByLys.MOD_ID);

    public static final Food JUICE = (new Food.Builder()).hunger(2).saturation(0.2F).build();

    public static final RegistryObject<Item> APPLE_JUICE = ITEMS.register("apple_juice",
      () -> new Drinkable(new Item.Properties()
        .food(JUICE)
        .containerItem(Items.GLASS_BOTTLE)
        .maxStackSize(16)
        .group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> CARROT_JUICE = ITEMS.register("carrot_juice",
      () -> new Drinkable(new Item.Properties()
        .food(JUICE)
        .containerItem(Items.GLASS_BOTTLE)
        .maxStackSize(16)
        .group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> PUMPKIN_JUICE = ITEMS.register("pumpkin_juice",
      () -> new Drinkable(new Item.Properties()
        .food(JUICE)
        .containerItem(Items.GLASS_BOTTLE)
        .maxStackSize(16)
        .group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> SWEETBERRY_JUICE = ITEMS.register("sweetberry_juice",
      () -> new Drinkable(new Item.Properties()
        .food(JUICE)
        .containerItem(Items.GLASS_BOTTLE)
        .maxStackSize(16)
        .group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> CHORUS_JUICE = ITEMS.register("chorus_juice",
      () -> new Drinkable(new Item.Properties()
        .food(JUICE)
        .containerItem(Items.GLASS_BOTTLE)
        .maxStackSize(16)
        .group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> MELON_JUICE = ITEMS.register("melon_juice",
      () -> new Drinkable(new Item.Properties()
        .food(JUICE)
        .containerItem(Items.GLASS_BOTTLE)
        .maxStackSize(16)
        .group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> SUGARCANE_JUICE = ITEMS.register("sugarcane_juice",
      () -> new Drinkable(new Item.Properties()
        .food(JUICE)
        .containerItem(Items.GLASS_BOTTLE)
        .maxStackSize(16)
        .group(ItemGroup.FOOD)));

    public static final RegistryObject<Item> BEETROOT_JUICE = ITEMS.register("beetroot_juice",
      () -> new Drinkable(new Item.Properties()
        .food(JUICE)
        .containerItem(Items.GLASS_BOTTLE)
        .maxStackSize(16)
        .group(ItemGroup.FOOD)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
