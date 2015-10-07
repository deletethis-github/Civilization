package deletethis.civilization.proxy;

import deletethis.civilization.Civilization;
import deletethis.civilization.util.EnumInitStage;
import deletethis.civilization.util.EnumProxySide;

public class CommonProxy
{	
	public void preInit()
	{
		Civilization.getModuleManager().init(EnumInitStage.PRE_INIT, EnumProxySide.COMMON);
	}
	
	public void init()
	{
		Civilization.getModuleManager().init(EnumInitStage.INIT, EnumProxySide.COMMON);
	}
	
	public void postInit()
	{
		Civilization.getModuleManager().init(EnumInitStage.POST_INIT, EnumProxySide.COMMON);
	}
}
