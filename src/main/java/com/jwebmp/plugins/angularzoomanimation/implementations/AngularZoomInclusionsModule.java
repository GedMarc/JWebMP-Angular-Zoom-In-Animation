package com.jwebmp.plugins.angularzoomanimation.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AngularZoomInclusionsModule implements IGuiceScanModuleInclusions<AngularZoomInclusionsModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.angularzoomanimation");
		return set;
	}
}
