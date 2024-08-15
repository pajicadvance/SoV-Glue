package me.pajic.sov.glue.module.repurposed_structures;

import me.pajic.sov.glue.Main;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;

public class CustomRSConfig {

    public static void init() {
        FabricLoader.getInstance().getModContainer("sov-glue").ifPresent(modContainer -> {
            if (Main.CONFIG.customRSConfigDatapack() && FabricLoader.getInstance().isModLoaded("repurposed_structures")) {
                ResourceManagerHelper.registerBuiltinResourcePack(
                        ResourceLocation.parse("sov-glue:sovrsconfig"),
                        modContainer,
                        ResourcePackActivationType.ALWAYS_ENABLED
                );
            }
        });
    }
}
