package za.co.mmagon.jwebswing.plugins.angularzoomanimation;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * Allows for elements to have a zoom in animation by adding a class
 *
 * @author Marc Magon
 * @since 16 Jun 2017
 */
@PluginInformation(pluginName = "Angular Zoom In",
        pluginDescription = "Allows for almost anything to have the zoom in effect attached by simply adding the zoomin class to any element.",
        pluginUniqueName = "jwebswing-angular-zoom-in-animation",
        pluginVersion = "1.0.0",
        pluginCategories = "angular,animation,zoom, ui,web ui, framework",
        pluginSubtitle = "Allows for almost anything to have the zoom in effect attached by simply adding the zoomin class to any element.",
        pluginSourceUrl = "https://docs.angularjs.org/api/ngTouch",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Zoom-In-Animation/wiki",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Zoom-In-Animation",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginOriginalHomepage = "https://docs.angularjs.org/api/ngTouch",
        pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularTouch.jar/download"
)
@ComponentInformation(name = "Angular Zoom In",
        description = "Allows for almost anything to have the zoom in effect attached by simply adding the zoomin class to any element.",
        url = "https://docs.angularjs.org/api/ngTouch")
public class AngularZoomInAnimationPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new AngularZoomInAnimationPageConfigurator
     */
    public AngularZoomInAnimationPageConfigurator()
    {
        //Nothing needed
    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            JQueryPageConfigurator.setRequired(page.getBody(), true);
            AngularPageConfigurator.setRequired(page.getBody(), true);
            page.getAngular().getAngularDirectives().add(new AngularZoomInDirective());
        }
        return page;
    }

    public static void addZoomEffect(ComponentHierarchyBase component)
    {
        component.addClass("zoomIn");
    }
}
