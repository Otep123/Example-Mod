package cadiboo.examplemod.init;

import cadiboo.examplemod.item.ItemExampleIngot;
import cadiboo.examplemod.util.ModReference;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * Item Instances class
 * All the items in here will be public static final and null as their values will be filled by the magical @ObjectHolder
 * 
 * @author Cadiboo
 */
@ObjectHolder(ModReference.MOD_ID)
public class ModItems {

	public static final ItemExampleIngot EXAMPLE_INGOT = null;

}
