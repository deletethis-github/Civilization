package deletethis.civilization.module;

import java.util.HashMap;
import java.util.Map;

import deletethis.civilization.util.EnumInitStage;
import deletethis.civilization.util.EnumProxySide;

public class ModuleManager
{
	private HashMap<String, CivilizationModule> modules;
	
	public ModuleManager()
	{
		modules = new HashMap<String, CivilizationModule>();
		this.addModule(ModuleMaterials.class);
	}
	
	private void addModule(Class<? extends CivilizationModule> moduleClass)
	{
		CivilizationModule instance = null;
		if(moduleClass != null)
		{
			try {instance = moduleClass.newInstance();}
			catch (InstantiationException e) {}
			catch (IllegalAccessException e) {}
		}
		modules.put(instance.getName(), instance);
	}
	
	public CivilizationModule getModule(String moduleName)
	{
		return modules.get(moduleName);
	}
	
	public boolean isModuleEnabled(String moduleName)
	{
		return modules.containsKey(moduleName);
	}
	
	public void init(EnumInitStage stage, EnumProxySide proxySide)
	{
		for(Map.Entry<String, CivilizationModule> entry : modules.entrySet())
		{
			CivilizationModule module = entry.getValue();
			module.init(stage, proxySide);
		}
	}
}
