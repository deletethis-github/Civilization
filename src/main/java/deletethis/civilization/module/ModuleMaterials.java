package deletethis.civilization.module;

import deletethis.civilization.CivilizationInfo;
import deletethis.civilization.block.BlockCarrot;
import deletethis.civilization.block.BlockCharcoal;
import deletethis.civilization.block.BlockFlint;
import deletethis.civilization.block.BlockPotato;
import deletethis.civilization.block.BlockReeds;
import deletethis.civilization.util.EnumInitStage;
import deletethis.civilization.util.EnumProxySide;
import deletethis.civilization.util.RegistryHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
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
	public static BlockCarrot blockCarrot;
	public static BlockPotato blockPotato;
	
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
		GameRegistry.registerBlock(blockReeds, RegistryHelper.getRegistryName(blockReeds));
		
		blockFlint = new BlockFlint();
		GameRegistry.registerBlock(blockFlint, RegistryHelper.getRegistryName(blockFlint));
		
		blockCharcoal = new BlockCharcoal();
		GameRegistry.registerBlock(blockCharcoal, RegistryHelper.getRegistryName(blockCharcoal));
		
		blockCarrot = new BlockCarrot();
		GameRegistry.registerBlock(blockCarrot, RegistryHelper.getRegistryName(blockCarrot));
		
		blockPotato = new BlockPotato();
		GameRegistry.registerBlock(blockPotato, RegistryHelper.getRegistryName(blockPotato));
	}
	
	public void registerItemBlockModels()
	{
		ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		
		Item blockReedsItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockReeds.getUnlocalizedName().substring(5));
		ModelResourceLocation blockReedsModelResourceLocation = new ModelResourceLocation(RegistryHelper.getFullRegistryName(blockReeds), "inventory");
		itemModelMesher.register(blockReedsItemBlock, 0, blockReedsModelResourceLocation);
		
		Item blockFlintItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockFlint.getUnlocalizedName().substring(5));
		ModelResourceLocation blockFlintModelResourceLocation = new ModelResourceLocation(RegistryHelper.getFullRegistryName(blockFlint), "inventory");
		itemModelMesher.register(blockFlintItemBlock, 0, blockFlintModelResourceLocation);
		
		Item blockCharcoalItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockCharcoal.getUnlocalizedName().substring(5));
		ModelResourceLocation blockCharcoalModelResourceLocation = new ModelResourceLocation(RegistryHelper.getFullRegistryName(blockCharcoal), "inventory");
		itemModelMesher.register(blockCharcoalItemBlock, 0, blockCharcoalModelResourceLocation);
		
		Item blockCarrotItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockCarrot.getUnlocalizedName().substring(5));
		ModelResourceLocation blockCarrotModelResourceLocation = new ModelResourceLocation(RegistryHelper.getFullRegistryName(blockCarrot), "inventory");
		itemModelMesher.register(blockCarrotItemBlock, 0, blockCarrotModelResourceLocation);
		
		Item blockPotatoItemBlock = GameRegistry.findItem(CivilizationInfo.ID, blockPotato.getUnlocalizedName().substring(5));
		ModelResourceLocation blockPotatoModelResourceLocation = new ModelResourceLocation(RegistryHelper.getFullRegistryName(blockPotato), "inventory");
		itemModelMesher.register(blockPotatoItemBlock, 0, blockPotatoModelResourceLocation);
	}
	
	public void addRecipes()
	{		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.reeds, 9), new ItemStack(blockReeds, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockReeds, 1), "rrr", "rrr", "rrr", 'r', new ItemStack(Items.reeds, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flint, 9), new ItemStack(blockFlint, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockFlint, 1), "fff", "fff", "fff", 'f', new ItemStack(Items.flint, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 9, 1), new ItemStack(blockCharcoal, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockCharcoal, 1), "ccc", "ccc", "ccc", 'c', new ItemStack(Items.coal, 1, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.carrot, 9), new ItemStack(blockCarrot, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockCarrot, 1), "ccc", "ccc", "ccc", 'c', new ItemStack(Items.carrot, 1));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.potato, 9), new ItemStack(blockPotato, 1));
		GameRegistry.addShapedRecipe(new ItemStack(blockPotato, 1), "ppp", "ppp", "ppp", 'p', new ItemStack(Items.potato, 1));
	}
}
