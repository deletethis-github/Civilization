package deletethis.civilization.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPotatoesBarrel extends Block
{
	public BlockPotatoesBarrel()
	{
		super(Material.wood);
		this.setUnlocalizedName("potatoes_block");
		this.setHardness(5.0F);
		this.setResistance(10.0F);
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
