package yukkuriproject_hydrogen.procedures;

import yukkuriproject_hydrogen.init.YukkuriprojectModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class HydrogenblockburotukugaZhuiJiasaretatokiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(YukkuriprojectModBlocks.HYDROGENBLOCK.get())) : false) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 20, Level.ExplosionInteraction.TNT);
		}
	}
}
