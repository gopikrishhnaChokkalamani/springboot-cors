package com.gi.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {

	// Comment the @CrossOrigin at RestController and enable this. This is Cors enablement through java config
	/*@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("*").allowedHeaders("Content-Type")
				.exposedHeaders("some header1", "some header2").allowCredentials(false).maxAge(6000);
	}*/
}
