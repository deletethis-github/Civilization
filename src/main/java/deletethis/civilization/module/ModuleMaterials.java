package deletethis.civilization.module;

import deletethis.civilization.CivilizationInfo;
import deletethis.civilization.block.BlockFlint;
import deletethis.civilization.block.BlockReeds;
import deletethis.civilization.util.EnumInitStage;
import deletethis.civilization.util.EnumProxySide;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModuleMaterials extends CivilizationModule
{
	public static BlockReeds blockReeds;
	public static BlockFlint blockFlint;
	
	public ModuleMaterials()
	{
		this.setName("CORE");
	}
	
	@Override
	public void init(EnumInitStage stage, EnumProxySide proxySide)
	{
		if(stage == EnumInitStage.PRE_INIT)
		{
			if(proxySide == EnumProxySide.COMMON)
			{
				registerBlocks();
				addRecipes();
			}
		}
		if(stage == EnumInitStage.INIT)
		{
			if(proxySide == EnumProxySide.CLIENT)
			{
				registerItemBlockModels();
			}
		}
	}
	
	public void registerBlocks()
	{
		blockReeds = new BlockReeds();
		GameRegistry.registerBlock(blockReeds, blockReeds.getUnlocalizedName().substring(5));
		
		blockFlint = new BlockFlint();
		GameRegistry.registerBlock(blockFlint, blockFlint.getUnlocalizedName().substring(5));
	}
	
	public void registerItemBlockModels()
	{
		Item reedsItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockReeds.getUnlocalizedName().substring(5));
		ModelResourceLocation blockReedsModelLocation = new ModelResourceLocation(CivilizationInfo.ID + ":" + blockReeds.getUnlocalizedName().substring(5), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(reedsItemBlock, 0, blockReedsModelLocation);
		
		Item flintItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockFlint.getUnlocalizedName().substring(5));
		ModelResourceLocation blockFlintModelLocation = new ModelResourceLocation(CivilizationInfo.ID + ":" + blockFlint.getUnlocalizedName().substring(5), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(flintItemBlock, 0, blockFlintModelLocation);
	}
	
	public void addRecipes()
	{		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.reeds, 9), new ItemStack(blockReeds, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockReeds, 1), "rrr", "rrr", "rrr", 'r', new ItemStack(Items.reeds, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flint, 9), new ItemStack(blockFlint, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockFlint, 1), "fff", "fff", "fff", 'f', new ItemStack(Items.flint, 1));
	}
}
