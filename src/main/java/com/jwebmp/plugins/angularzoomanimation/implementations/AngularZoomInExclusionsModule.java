package com.jwebmp.plugins.angularzoomanimation.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularZoomInExclusionsModule
		implements IGuiceScanModuleExclusions<AngularZoomInExclusionsModule>,
				           IGuiceScanJarExclusions<AngularZoomInExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-angular-ui-zoom-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularzoomanimation");
		return strings;
	}
}
