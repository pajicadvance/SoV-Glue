package me.pajic.sov.glue.emi;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import me.pajic.sov.glue.emi.guarding.NetheriteShieldEmiRecipe;

public class GlueEmiPlugin implements EmiPlugin {

    @Override
    public void register(EmiRegistry registry) {
        NetheriteShieldEmiRecipe.init(registry);
    }
}
