package deletethis.civilization;

import deletethis.civilization.module.ModuleManager;
import deletethis.civilization.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class Civilization
{
	@Instance(ModInfo.ID)
	private static Civilization instance;
	
	@SidedProxy(clientSide = "deletethis.civilization.proxy.ClientProxy", serverSide = "deletethis.civilization.proxy.ServerProxy")
	private static CommonProxy proxy;
	
	private static ModuleManager moduleManager;
	
	public static Civilization getInstance()
	{
		return instance;
	}
	
	public static CommonProxy getProxy()
	{
		return proxy;
	}
	
	public static ModuleManager getModuleManager()
	{
		return moduleManager;
	}

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	Civilization.getProxy().preInit();
    }
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Civilization.getProxy().init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	Civilization.getProxy().postInit();
    }
}
