package me.pajic.modglue.mixin.fdrf;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.moulberry.mixinconstraints.annotations.IfModLoaded;
import me.pajic.modglue.raised.FarmersDelightCompat;
import net.fabricmc.loader.api.FabricLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import vectorwing.farmersdelight.client.gui.HUDOverlays;

@IfModLoaded("farmersdelight")
@Mixin(HUDOverlays.BaseOverlay.class)
public class HUDOverlaysMixin {

    @ModifyExpressionValue(
            method = "render(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/client/DeltaTracker;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/GuiGraphics;guiHeight()I"
            )
    )
    private int adjustHudElementVerticalPos(int original) {
        if (FabricLoader.getInstance().isModLoaded("raised")) {
            return FarmersDelightCompat.runY(original);
        }
        return original;
    }

    @ModifyExpressionValue(
            method = "render(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/client/DeltaTracker;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/GuiGraphics;guiWidth()I"
            )
    )
    private int adjustHudElementHorizontalPos(int original) {
        if (FabricLoader.getInstance().isModLoaded("raised")) {
            return FarmersDelightCompat.runX(original);
        }
        return original;
    }
}
