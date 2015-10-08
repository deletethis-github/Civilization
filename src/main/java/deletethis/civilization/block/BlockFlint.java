package deletethis.civilization.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFlint extends Block
{
	public BlockFlint()
	{
		super(Material.piston);
		this.setUnlocalizedName("flint_block");
		this.setHardness(5.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypePiston);
        this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
