import com.jwebmp.plugins.angularzoomanimation.implementations.AngularZoomInclusionsModule;

module com.jwebmp.plugins.angularzoomanimation {
	exports com.jwebmp.plugins.angularzoomanimation;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angular;

	opens com.jwebmp.plugins.angularzoomanimation to com.jwebmp.core;
	
	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularzoomanimation.AngularZoomInAnimationPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angularzoomanimation.AngularZoomInDirective;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with AngularZoomInclusionsModule;
	
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularzoomanimation.implementations.AngularZoomInExclusionsModule;
}
