/**
 * @author MEHELLOU Abdelatif
 * */
package com.abdelatif.atexo.data;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/carte.properties")
@ConfigurationProperties
public class Couleurs {
	private List<String> couleurs = new ArrayList<String>();

	public List<String> getCouleurs() {
		return couleurs;
	}


	public void setCouleurs(List<String> couleurs) {
		this.couleurs = couleurs;
	}
}