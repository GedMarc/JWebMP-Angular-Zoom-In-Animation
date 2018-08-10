import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularzoomanimation.AngularZoomInAnimationPageConfigurator;
import com.jwebmp.plugins.angularzoomanimation.AngularZoomInDirective;

module com.jwebmp.plugins.angularzoomanimation {
	exports com.jwebmp.plugins.angularzoomanimation;

	requires com.jwebmp.core;
	requires java.validation;

	provides IPageConfigurator with AngularZoomInAnimationPageConfigurator;
	provides IAngularDirective with AngularZoomInDirective;

}
