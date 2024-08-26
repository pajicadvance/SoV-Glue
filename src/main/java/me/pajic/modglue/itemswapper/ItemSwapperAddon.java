package me.pajic.modglue.itemswapper;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;

public class ItemSwapperAddon {

    public static void init() {
        FabricLoader.getInstance().getModContainer("modglue").ifPresent(modContainer -> {
            if (FabricLoader.getInstance().isModLoaded("itemswapper")) {
                if (FabricLoader.getInstance().isModLoaded("chalk")) {
                    ResourceManagerHelper.registerBuiltinResourcePack(
                            ResourceLocation.parse("sov-glue:chalkitemswap"),
                            modContainer,
                            ResourcePackActivationType.ALWAYS_ENABLED
                    );
                }
                if (FabricLoader.getInstance().isModLoaded("comforts")) {
                    ResourceManagerHelper.registerBuiltinResourcePack(
                            ResourceLocation.parse("sov-glue:comfortsitemswap"),
                            modContainer,
                            ResourcePackActivationType.ALWAYS_ENABLED
                    );
                }
                if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
                    ResourceManagerHelper.registerBuiltinResourcePack(
                            ResourceLocation.parse("sov-glue:fditemswap"),
                            modContainer,
                            ResourcePackActivationType.ALWAYS_ENABLED
                    );
                }
                if (FabricLoader.getInstance().isModLoaded("guarding")) {
                    ResourceManagerHelper.registerBuiltinResourcePack(
                            ResourceLocation.parse("sov-glue:guardingitemswap"),
                            modContainer,
                            ResourcePackActivationType.ALWAYS_ENABLED
                    );
                }
            }
        });
    }
}
