package me.pajic.modglue.emi.vanilla;

import dev.emi.emi.EmiPort;
import dev.emi.emi.EmiUtil;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.recipe.EmiAnvilRecipe;
import net.minecraft.world.item.Items;

public class MaceEmiRepairRecipe {

    public static void init(EmiRegistry registry) {
        registry.addRecipe(new EmiAnvilRecipe(
                EmiStack.of(Items.MACE),
                EmiStack.of(Items.BREEZE_ROD),
                EmiPort.id(
                        "emi",
                        "/" + "anvil/repairing/material" +
                                "/" + EmiUtil.subId(Items.MACE) +
                                "/" + EmiUtil.subId(Items.BREEZE_ROD)
                )
        ));
    }
}
