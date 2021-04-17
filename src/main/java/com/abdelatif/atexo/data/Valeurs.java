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
public class Valeurs {
	/*private Map<Integer, String> valeurs = new HashMap<Integer, String>();

	public Map<Integer, String> getValeurs() {
		return valeurs;
	}

	public void setValeurs(Map<Integer, String> valeurs) {
		this.valeurs = valeurs;
	}
	
	public String getValueByIndex(Integer index) {
		return valeurs.containsKey(index) ? valeurs.get(index) : null;
	}*/
	private List<String> valeurs = new ArrayList<>();
	
	public List<String> getValeurs() {
		return valeurs;
	}

	public void setValeurs(List<String> valeurs) {
		this.valeurs = valeurs;
	}
}
