package me.pajic.modglue.mixin.particlerain;

import com.moulberry.mixinconstraints.annotations.IfModLoaded;
import me.pajic.modglue.particular.ParticleRainCompat;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.SpriteSet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pigcart.particlerain.particle.RainDropParticle;
import pigcart.particlerain.particle.WeatherParticle;

@IfModLoaded("particlerain")
@Mixin(RainDropParticle.class)
public abstract class RainDropParticleMixin extends WeatherParticle {

    protected RainDropParticleMixin(ClientLevel level, double x, double y, double z, float gravity, SpriteSet provider) {
        super(level, x, y, z, gravity, provider);
    }

    @Inject(
            method = "tick",
            at = @At(
                    value = "INVOKE",
                    target = "Lpigcart/particlerain/particle/RainDropParticle;remove()V",
                    ordinal = 1
            )
    )
    private void renderParticularRainRipples(CallbackInfo ci) {
        if (FabricLoader.getInstance().isModLoaded("particular")) {
            ParticleRainCompat.run(level, pos, x, y, z);
        }
    }
}
