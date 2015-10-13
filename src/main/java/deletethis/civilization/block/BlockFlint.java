package deletethis.civilization.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFlint extends Block
{
	public BlockFlint()
	{
		super(Material.rock);
		this.setUnlocalizedName("flint_block");
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
