package me.pajic.modglue.mixin.elytraswimfix;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.moulberry.mixinconstraints.annotations.IfModLoaded;
import com.teashoe.elytraswimfix.ElytraSwimFix;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;

import java.util.Optional;

@IfModLoaded(value = "elytraswimfix", aliases = {"trinkets"})
@Mixin(ElytraSwimFix.class)
public class ElytraSwimFixMixin {

    @WrapMethod(method = "isWearingElytra")
    public boolean isWearingElytra(ServerPlayer player, Operation<Boolean> original) {
        Optional<TrinketComponent> component = TrinketsApi.getTrinketComponent(player);
        if (component.isPresent() && component.get().isEquipped(Items.ELYTRA)) {
            return true;
        }
        return original.call(player);
    }
}
