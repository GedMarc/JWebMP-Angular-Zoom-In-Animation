package za.co.mmagon.jwebswing.plugins.angularzoomanimation;

import za.co.mmagon.FileTemplates;
import za.co.mmagon.jwebswing.base.angular.directives.AngularDirectiveBase;

/**
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularZoomInDirective
		extends AngularDirectiveBase
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularZoomInDirective
	 */
	public AngularZoomInDirective()
	{
		super("ZoomIn");
	}

	@Override
	public String renderFunction()
	{
		return FileTemplates.getFileTemplate(AngularZoomInDirective.class, "zoomIn.min")
		                    .toString();
	}
}
