package me.pajic.modglue.emi.guarding;

import com.teamabode.guarding.core.registry.GuardingItems;
import dev.emi.emi.EmiPort;
import dev.emi.emi.EmiUtil;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.recipe.EmiSmithingRecipe;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.item.Items;

public class NetheriteShieldEmiRecipe {

    public static void init(EmiRegistry registry) {
        if (FabricLoader.getInstance().isModLoaded("guarding")) {
            registry.addRecipe(new EmiSmithingRecipe(
                    EmiStack.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                    EmiStack.of(Items.SHIELD),
                    EmiStack.of(Items.NETHERITE_INGOT),
                    EmiStack.of(GuardingItems.NETHERITE_SHIELD),
                    EmiPort.id(
                            "emi",
                            "/" + "smithing/upgrade" +
                                    "/" + EmiUtil.subId(Items.SHIELD) +
                                    "/" + EmiUtil.subId(GuardingItems.NETHERITE_SHIELD)
                    )
            ));
        }
    }
}
