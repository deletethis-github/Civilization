package deletethis.civilization.proxy;

import deletethis.civilization.Civilization;
import deletethis.civilization.util.EnumInitStage;
import deletethis.civilization.util.EnumProxySide;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit()
	{
		super.preInit();
		Civilization.getModuleManager().init(EnumInitStage.PRE_INIT, EnumProxySide.CLIENT);
	}
	
	@Override
	public void init()
	{
		super.init();
		Civilization.getModuleManager().init(EnumInitStage.INIT, EnumProxySide.CLIENT);
	}
	
	@Override
	public void postInit()
	{
		super.postInit();
		Civilization.getModuleManager().init(EnumInitStage.POST_INIT, EnumProxySide.CLIENT);
	}
}
