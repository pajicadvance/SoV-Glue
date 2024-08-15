package me.pajic.sov.glue;

import me.pajic.sov.glue.config.GlueConfig;
import me.pajic.sov.glue.repurposed_structures.CustomRSConfig;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    public static final GlueConfig CONFIG = GlueConfig.createAndLoad();

    @Override
    public void onInitialize() {
        CustomRSConfig.init();
    }
}
