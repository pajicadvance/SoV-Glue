package me.pajic.modglue.particular;

import com.chailotl.particular.Main;
import com.chailotl.particular.Particles;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.Level;

public class ParticleRainCompat {

    public static void run(Level level, BlockPos pos, double x, double y, double z) {
        if (level.getFluidState(pos).is(FluidTags.WATER) && Main.CONFIG.rainRipples()) {
            Minecraft.getInstance().particleEngine.createParticle(Particles.WATER_RIPPLE, x, y, z, 0.0, 0.0, 0.0);
        }
    }
}
