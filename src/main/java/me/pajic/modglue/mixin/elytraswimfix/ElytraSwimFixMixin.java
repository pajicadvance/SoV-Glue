package me.pajic.modglue.mixin.elytraswimfix;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.moulberry.mixinconstraints.annotations.IfModLoaded;
import com.teashoe.elytraswimfix.ElytraSwimFix;
import me.pajic.modglue.trinkets.ElytraSwimFixCompat;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.level.ServerPlayer;
import org.spongepowered.asm.mixin.Mixin;

@IfModLoaded("elytraswimfix")
@Mixin(ElytraSwimFix.class)
public class ElytraSwimFixMixin {

    @WrapMethod(method = "isWearingElytra")
    public boolean isWearingElytra(ServerPlayer player, Operation<Boolean> original) {
        if (FabricLoader.getInstance().isModLoaded("trinkets")) {
            return ElytraSwimFixCompat.run(player) || original.call(player);
        }
        return original.call(player);
    }
}
