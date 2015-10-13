package deletethis.civilization.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockString extends Block
{
	public BlockString()
	{
		super(Material.wood);
		this.setUnlocalizedName("string_block");
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeWood);
        this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean isFullCube()
	{
		return false;
	}
}
