package me.pajic.modglue.emi;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import me.pajic.modglue.emi.guarding.NetheriteShieldEmiRecipe;

public class GlueEmiPlugin implements EmiPlugin {

    @Override
    public void register(EmiRegistry registry) {
        NetheriteShieldEmiRecipe.init(registry);
    }
}
