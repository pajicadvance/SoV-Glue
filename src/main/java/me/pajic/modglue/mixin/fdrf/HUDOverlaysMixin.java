package me.pajic.modglue.mixin.fdrf;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.moulberry.mixinconstraints.annotations.IfModLoaded;
import dev.yurisuika.raised.api.RaisedApi;
import dev.yurisuika.raised.util.properties.Element;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import vectorwing.farmersdelight.client.gui.HUDOverlays;

@IfModLoaded("farmersdelight")
@Mixin(HUDOverlays.BaseOverlay.class)
public class HUDOverlaysMixin {

    @IfModLoaded("raised")
    @ModifyExpressionValue(
            method = "render(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/client/DeltaTracker;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/GuiGraphics;guiHeight()I"
            )
    )
    private int adjustHudElementVerticalPos(int original) {
        return original + (RaisedApi.getY(Element.HOTBAR) * RaisedApi.getPosition(Element.HOTBAR).getY());
    }

    @IfModLoaded("raised")
    @ModifyExpressionValue(
            method = "render(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/client/DeltaTracker;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/GuiGraphics;guiWidth()I"
            )
    )
    private int adjustHudElementHorizontalPos(int original) {
        return original + (RaisedApi.getX(Element.HOTBAR) * RaisedApi.getPosition(Element.HOTBAR).getX());
    }
}
