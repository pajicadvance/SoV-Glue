package me.pajic.modglue.mixin.mousetweaks;

import com.llamalad7.mixinextras.sugar.Local;
import com.moulberry.mixinconstraints.annotations.IfModLoaded;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import yalter.mousetweaks.Main;

@IfModLoaded("mousetweaks")
@Mixin(Main.class)
public class MainMixin {

    @Inject(
            method = "onMouseScrolled",
            at = @At(
                    value = "INVOKE",
                    target = "Lyalter/mousetweaks/IGuiScreenHandler;isIgnored(Lnet/minecraft/world/inventory/Slot;)Z"
            ),
            cancellable = true
    )
    private static void ignoreBundleScroll(Screen screen, double x, double y, double scrollDelta,
                                           CallbackInfoReturnable<Boolean> cir,
                                           @Local Slot selectedSlot
    ) {
        if (FabricLoader.getInstance().isModLoaded("bundle_scroll") && selectedSlot.getItem().is(Items.BUNDLE)) {
            cir.setReturnValue(false);
        }
    }
}
