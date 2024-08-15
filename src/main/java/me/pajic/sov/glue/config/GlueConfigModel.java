package me.pajic.sov.glue.config;

import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.SectionHeader;
import io.wispforest.owo.config.annotation.Sync;

@Modmenu(modId = "sov-glue")
@Config(name = "glue", wrapperName = "GlueConfig")
@Sync(Option.SyncMode.OVERRIDE_CLIENT)
@SuppressWarnings("unused")
public class GlueConfigModel {

    @SectionHeader("repurposedStructures")
    public boolean customRSConfigDatapack = true;

    @SectionHeader("notes")
    public boolean notesButtonLock = true;

    @SectionHeader("guarding")
    public boolean guardingNetheriteShieldRecipe = true;
}
