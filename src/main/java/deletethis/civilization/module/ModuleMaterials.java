package deletethis.civilization.module;

import deletethis.civilization.CivilizationInfo;
import deletethis.civilization.block.BlockCarrotsBarrel;
import deletethis.civilization.block.BlockCharcoal;
import deletethis.civilization.block.BlockFlint;
import deletethis.civilization.block.BlockPotatoesBarrel;
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
	public static BlockCharcoal blockCharcoal;
	public static BlockCarrotsBarrel blockCarrots;
	public static BlockPotatoesBarrel blockPotatoes;
	
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
		
		blockCharcoal = new BlockCharcoal();
		GameRegistry.registerBlock(blockCharcoal, blockCharcoal.getUnlocalizedName().substring(5));
		
		blockCarrots = new BlockCarrotsBarrel();
		GameRegistry.registerBlock(blockCarrots, blockCarrots.getUnlocalizedName().substring(5));
		
		blockPotatoes = new BlockPotatoesBarrel();
		GameRegistry.registerBlock(blockPotatoes, blockPotatoes.getUnlocalizedName().substring(5));
	}
	
	public void registerItemBlockModels()
	{
		Item reedsItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockReeds.getUnlocalizedName().substring(5));
		ModelResourceLocation blockReedsModelLocation = new ModelResourceLocation(CivilizationInfo.ID + ":" + blockReeds.getUnlocalizedName().substring(5), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(reedsItemBlock, 0, blockReedsModelLocation);
		
		Item flintItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockFlint.getUnlocalizedName().substring(5));
		ModelResourceLocation blockFlintModelLocation = new ModelResourceLocation(CivilizationInfo.ID + ":" + blockFlint.getUnlocalizedName().substring(5), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(flintItemBlock, 0, blockFlintModelLocation);
		
		Item charcoalItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockCharcoal.getUnlocalizedName().substring(5));
		ModelResourceLocation blockCharcoalModelLocation = new ModelResourceLocation(CivilizationInfo.ID + ":" + blockCharcoal.getUnlocalizedName().substring(5), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(charcoalItemBlock, 0, blockCharcoalModelLocation);
		
		Item carrotsItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockCarrots.getUnlocalizedName().substring(5));
		ModelResourceLocation blockCarrotsModelLocation = new ModelResourceLocation(CivilizationInfo.ID + ":" + blockCarrots.getUnlocalizedName().substring(5), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(carrotsItemBlock, 0, blockCarrotsModelLocation);
		
		Item potatoesItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockPotatoes.getUnlocalizedName().substring(5));
		ModelResourceLocation blockPotatoesModelLocation = new ModelResourceLocation(CivilizationInfo.ID + ":" + blockPotatoes.getUnlocalizedName().substring(5), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(potatoesItemBlock, 0, blockPotatoesModelLocation);
	}
	
	public void addRecipes()
	{		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.reeds, 9), new ItemStack(blockReeds, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockReeds, 1), "rrr", "rrr", "rrr", 'r', new ItemStack(Items.reeds, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flint, 9), new ItemStack(blockFlint, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockFlint, 1), "fff", "fff", "fff", 'f', new ItemStack(Items.flint, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 9, 1), new ItemStack(blockCharcoal, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockCharcoal, 1), "ccc", "ccc", "ccc", 'c', new ItemStack(Items.coal, 1, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.carrot, 9), new ItemStack(blockCarrots, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockCarrots, 1), "ccc", "ccc", "ccc", 'c', new ItemStack(Items.carrot, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.potato, 9), new ItemStack(blockPotatoes, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockPotatoes, 1), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.potato, 1));
	}
}
