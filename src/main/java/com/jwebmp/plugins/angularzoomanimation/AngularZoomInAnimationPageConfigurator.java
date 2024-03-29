package com.jwebmp.plugins.angularzoomanimation;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * Allows for elements to have a zoom in animation by adding a class
 *
 * @author GedMarc
 * @since 16 Jun 2017
 */
@PluginInformation(pluginName = "Zoom In",
		pluginDescription = "Allows for almost anything to have the zoom in effect attached by simply adding the zoomin class to any " + "element.",
		pluginUniqueName = "angular-zoom-in-animation",
		pluginVersion = "1.0.0",
		pluginCategories = "angular,animation,zoom, ui,web ui, framework",
		pluginSubtitle = "Allows for almost anything to have the zoom in effect attached by simply adding the zoomin class to any " + "element.",
		pluginSourceUrl = "https://angularscript.com/simple-image-zoom-angularjs/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Angular-Zoom-In-Animation/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Angular-Zoom-In-Animation",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://angularscript.com/simple-image-zoom-angularjs/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.angular/jwebmp-angular-ui-zoom",
		pluginGroupId = "com.jwebmp.plugins.angular",
		pluginArtifactId = "jwebmp-angular-ui-zoom",
		pluginModuleName = "com.jwebmp.plugins.angularzoomanimation",
		pluginStatus = PluginStatus.Released
)
@ComponentInformation(name = "Angular Zoom In",
		description = "Allows for almost anything to have the zoom in effect attached by simply adding the zoomin class to any element.",
		url = "https://angularscript.com/simple-image-zoom-angularjs/")
public class AngularZoomInAnimationPageConfigurator
		implements IPageConfigurator<AngularZoomInAnimationPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularZoomInAnimationPageConfigurator
	 */
	public AngularZoomInAnimationPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularZoomInAnimationPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularZoomInAnimationPageConfigurator.enabled = mustEnable;
	}

	public static void addZoomEffect(ComponentHierarchyBase component)
	{
		component.addClass("zoomIn");
	}

	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			
			
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularZoomInAnimationPageConfigurator.enabled;
	}
}
