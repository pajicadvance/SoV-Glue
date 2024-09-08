package me.pajic.modglue.trinkets;

import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Items;

import java.util.Optional;

public class ElytraSwimFixCompat {

    public static boolean run(ServerPlayer player) {
        Optional<TrinketComponent> component = TrinketsApi.getTrinketComponent(player);
        return component.isPresent() && component.get().isEquipped(Items.ELYTRA);
    }
}
