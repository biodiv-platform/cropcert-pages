package cropcert.pages.service;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class ServiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ImageService.class).in(Scopes.SINGLETON);
		bind(PageService.class).in(Scopes.SINGLETON);
	}
}
