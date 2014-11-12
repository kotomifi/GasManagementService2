package org.whut.iccard.application;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.filter.LoggingFilter;

public class RestApplication extends ResourceConfig  {
	public RestApplication() {
		// ���������ڰ�
		packages("org.whut.iccard.service");
		
		register(LoggingFilter.class);
		// ע��JSONת����
		register(JacksonJsonProvider.class);  
		register(ApplicationConfig.class);
	}
}
