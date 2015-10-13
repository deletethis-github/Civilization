package deletethis.civilization.block;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSugar extends BlockFalling
{
	public BlockSugar()
	{
		super(Material.sand);
		this.setUnlocalizedName("sugar_block");
		this.setHardness(0.5F);
		this.setStepSound(soundTypeSand);
        this.setCreativeTab(CreativeTabs.tabBlock);
	}
}
