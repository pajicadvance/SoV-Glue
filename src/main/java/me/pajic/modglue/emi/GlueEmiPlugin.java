package me.pajic.modglue.emi;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import me.pajic.modglue.emi.bettertridents.TridentEmiRepairRecipe;
import me.pajic.modglue.emi.guarding.NetheriteShieldEmiRecipe;
import me.pajic.modglue.emi.vanilla.MaceEmiRepairRecipe;
import net.fabricmc.loader.api.FabricLoader;

public class GlueEmiPlugin implements EmiPlugin {

    @Override
    public void register(EmiRegistry registry) {
        MaceEmiRepairRecipe.init(registry);
        if (FabricLoader.getInstance().isModLoaded("guarding")) {
            NetheriteShieldEmiRecipe.init(registry);
        }
        if (FabricLoader.getInstance().isModLoaded("bettertridents")) {
            TridentEmiRepairRecipe.init(registry);
        }
    }
}
