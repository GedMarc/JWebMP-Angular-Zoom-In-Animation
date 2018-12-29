import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularzoomanimation.AngularZoomInAnimationPageConfigurator;
import com.jwebmp.plugins.angularzoomanimation.AngularZoomInDirective;
import com.jwebmp.plugins.angularzoomanimation.implementations.AngularZoomInExclusionsModule;

module com.jwebmp.plugins.angularzoomanimation {
	exports com.jwebmp.plugins.angularzoomanimation;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides IPageConfigurator with AngularZoomInAnimationPageConfigurator;
	provides IAngularDirective with AngularZoomInDirective;

	provides IGuiceScanJarExclusions with AngularZoomInExclusionsModule;
	provides IGuiceScanModuleExclusions with AngularZoomInExclusionsModule;
}
