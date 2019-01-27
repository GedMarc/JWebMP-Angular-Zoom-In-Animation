module com.jwebmp.plugins.angularzoomanimation {
	exports com.jwebmp.plugins.angularzoomanimation;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularzoomanimation.AngularZoomInAnimationPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angularzoomanimation.AngularZoomInDirective;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularzoomanimation.implementations.AngularZoomInExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularzoomanimation.implementations.AngularZoomInExclusionsModule;
}
