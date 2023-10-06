package net.noirmidnight.expanse.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.noirmidnight.expanse.ExpanseMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExpanseMod.MOD_ID);

    // Malachite Items
    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MALACHITE_INGOT = ITEMS.register("malachite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MALACHITE_NUGGET = ITEMS.register("malachite_nugget",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
