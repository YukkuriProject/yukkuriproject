package yukkuriproject_hydrogen.entities;

import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import yukkuriproject_hydrogen.init.YukkuriprojectModSounds;

public class DonaldMagic extends PrimedTnt {
    public DonaldMagic(EntityType<? extends PrimedTnt> entityType, Level level) {
        super(entityType, level);
        init();
    }

    public DonaldMagic(Level level, double x, double y, double z, @Nullable LivingEntity owner) {
        super(level, x, y, z, owner);
        init();
    }


    private void init() {
        this.setFuse(0);
    }

    @Override
    protected void explode() {
        super.explode();

        this.level().playSound(null, this.blockPosition(), YukkuriprojectModSounds.DONALD_MAGIC.get(), SoundSource.MASTER);
    }
}
