package deletethis.civilization.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockReeds extends Block
{
	public static final PropertyEnum AXIS = PropertyEnum.create("axis", EnumFacing.Axis.class);
	
	public BlockReeds()
	{
		super(Material.grass);
		this.setUnlocalizedName("reeds_block");
		this.setHardness(0.5F);
		this.setStepSound(soundTypeGrass);
		this.setDefaultState(this.blockState.getBaseState().withProperty(AXIS, EnumFacing.Axis.Y));
        this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
    public IBlockState getStateFromMeta(int meta)
    {
    	EnumFacing.Axis axis = EnumFacing.Axis.values()[meta];
    	return this.getDefaultState().withProperty(AXIS, axis);
    }
    
	@Override
    public int getMetaFromState(IBlockState state)
    {
    	EnumFacing.Axis axis = (EnumFacing.Axis) state.getValue(AXIS);
    	int axisBits = axis.ordinal();
    	
    	return axisBits;
    }

	@Override
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {AXIS});
    }

	@Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
		return super.onBlockPlaced(world, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(AXIS, facing.getAxis());
    }
}
