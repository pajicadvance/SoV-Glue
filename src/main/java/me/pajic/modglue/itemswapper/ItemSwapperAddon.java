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
                            ResourceLocation.parse("modglue:chalkitemswap"),
                            modContainer,
                            ResourcePackActivationType.ALWAYS_ENABLED
                    );
                }
                if (FabricLoader.getInstance().isModLoaded("comforts")) {
                    ResourceManagerHelper.registerBuiltinResourcePack(
                            ResourceLocation.parse("modglue:comfortsitemswap"),
                            modContainer,
                            ResourcePackActivationType.ALWAYS_ENABLED
                    );
                }
                if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
                    ResourceManagerHelper.registerBuiltinResourcePack(
                            ResourceLocation.parse("modglue:fditemswap"),
                            modContainer,
                            ResourcePackActivationType.ALWAYS_ENABLED
                    );
                }
                if (FabricLoader.getInstance().isModLoaded("guarding")) {
                    ResourceManagerHelper.registerBuiltinResourcePack(
                            ResourceLocation.parse("modglue:guardingitemswap"),
                            modContainer,
                            ResourcePackActivationType.ALWAYS_ENABLED
                    );
                }
            }
        });
    }
}
