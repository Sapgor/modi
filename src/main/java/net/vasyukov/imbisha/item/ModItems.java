package net.vasyukov.imbisha.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vasyukov.imbisha.Imbisha;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Imbisha.MOD_ID);
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
    public static final RegistryObject<Item> FISH = ITEMS.register("fish", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));
}
