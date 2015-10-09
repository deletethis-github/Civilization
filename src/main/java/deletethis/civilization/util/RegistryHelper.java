package deletethis.civilization.util;

import deletethis.civilization.CivilizationInfo;
import net.minecraft.block.Block;

public class RegistryHelper
{
	public static String getRegistryName(Block block)
	{
		return block.getUnlocalizedName().substring(5);
	}
	
	public static String getFullRegistryName(Block block)
	{
		return CivilizationInfo.ID + ":" + getRegistryName(block);
	}
}
