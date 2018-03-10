package za.co.mmagon.jwebswing.plugins.angularzoomanimation;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Marc Magon
 */
public class AngularZoomInAnimationPageConfiguratorTest
		extends BaseTestClass
{

	public AngularZoomInAnimationPageConfiguratorTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		Page p = new Page();
		p.getOptions()
		 .setDynamicRender(false);
		System.out.println(p.toString(0));
		assertTrue(p.toString(0)
		            .contains("zoomIn"));
	}

}
