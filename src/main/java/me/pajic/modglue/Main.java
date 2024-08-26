package me.pajic.modglue;

import me.pajic.modglue.itemswapper.ItemSwapperAddon;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    @Override
    public void onInitialize() {
        ItemSwapperAddon.init();
    }
}
