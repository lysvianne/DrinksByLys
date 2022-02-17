package com.lysvianne.drinksbylys;

import com.lysvianne.drinksbylys.item.Drinks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DrinksItemGroup {

    public static final ItemGroup DRINKS_GROUP = new ItemGroup("drinksItemTab")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Drinks.CARROT_JUICE.get());
        }
    };
}
