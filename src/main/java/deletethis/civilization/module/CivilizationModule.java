package deletethis.civilization.module;

import deletethis.civilization.util.EnumInitStage;
import deletethis.civilization.util.EnumProxySide;

public abstract class CivilizationModule
{
	private String name = null;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void init(EnumInitStage stage, EnumProxySide proxySide) {}
}
