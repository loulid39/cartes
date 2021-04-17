/**
 * @author MEHELLOU Abdelatif
 * */
package com.abdelatif.atexo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class AtexoApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AtexoApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AtexoApplication.class, args);

	}

}
