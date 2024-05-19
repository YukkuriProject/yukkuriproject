
package yukkuriproject_hydrogen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HydrogenwaterItem extends Item {
	public HydrogenwaterItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
