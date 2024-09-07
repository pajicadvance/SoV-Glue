package me.pajic.modglue.emi.bettertridents;

import dev.emi.emi.EmiPort;
import dev.emi.emi.EmiUtil;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.recipe.EmiAnvilRecipe;
import net.minecraft.world.item.Items;

public class TridentEmiRepairRecipe {

    public static void init(EmiRegistry registry) {
        registry.addRecipe(new EmiAnvilRecipe(
                EmiStack.of(Items.TRIDENT),
                EmiStack.of(Items.PRISMARINE_SHARD),
                EmiPort.id(
                        "emi",
                        "/" + "anvil/repairing/material" +
                                "/" + EmiUtil.subId(Items.TRIDENT) +
                                "/" + EmiUtil.subId(Items.PRISMARINE_SHARD)
                )
        ));
    }
}
