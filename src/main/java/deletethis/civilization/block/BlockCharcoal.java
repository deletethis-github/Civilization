package deletethis.civilization.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCharcoal extends Block
{
	public BlockCharcoal()
	{
		super(Material.rock);
		this.setUnlocalizedName("charcoal_block");
		this.setHardness(5.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
