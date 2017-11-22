package org.seven.caishigou.test.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: CustomizedRestMvcConfiguration
 * @Description: TODO
 * @author seven
 * @date Nov 21, 2017 4:37:23 PM
 *
 */
@Component
public class CustomizedRestMvcConfiguration extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.setBasePath("/api");
		config.setRepositoryDetectionStrategy(RepositoryDetectionStrategy.RepositoryDetectionStrategies.DEFAULT);
	}

}