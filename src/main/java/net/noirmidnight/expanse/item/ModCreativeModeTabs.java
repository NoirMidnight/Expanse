package net.noirmidnight.expanse.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.noirmidnight.expanse.ExpanseMod;
import net.noirmidnight.expanse.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExpanseMod.MOD_ID);

public static final RegistryObject<CreativeModeTab> EXPANSE = CREATIVE_MODE_TABS.register("expanse",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MALACHITE.get())).title(Component.translatable("creativetab.expanse"))
                .displayItems((displayParameters, output) -> {
                    output.accept(ModItems.MALACHITE.get());
                    output.accept(ModItems.MALACHITE_INGOT.get());
                    output.accept(ModItems.MALACHITE_NUGGET.get());

                    output.accept(ModBlocks.MALACHITE_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_MALACHITE_ORE.get());
                    output.accept(ModBlocks.RAW_MALACHITE_BLOCK.get());
                    output.accept(ModBlocks.MALACHITE_BLOCK.get());

                }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
