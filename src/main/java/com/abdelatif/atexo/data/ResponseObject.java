/**
 * @author MEHELLOU Abdelatif
 * */
package com.abdelatif.atexo.data;
/**
 * ResponseObject : une classe qui contient les données d'une réponse d'un essai
 * */
import java.util.List;

public class ResponseObject {
	private List<String> colorOrder;
	private List<String> valueOrder;
	private List<Carte> nonOrderedCartes;
	private List<Carte> orderedCartes;
	public List<String> getColorOrder() {
		return colorOrder;
	}
	public void setColorOrder(List<String> colorOrder) {
		this.colorOrder = colorOrder;
	}
	public List<String> getValueOrder() {
		return valueOrder;
	}
	public void setValueOrder(List<String> valueOrder) {
		this.valueOrder = valueOrder;
	}
	public List<Carte> getNonOrderedCartes() {
		return nonOrderedCartes;
	}
	public void setNonOrderedCartes(List<Carte> nonOrderedCartes) {
		this.nonOrderedCartes = nonOrderedCartes;
	}
	public List<Carte> getOrderedCartes() {
		return orderedCartes;
	}
	public void setOrderedCartes(List<Carte> orderedCartes) {
		this.orderedCartes = orderedCartes;
	}	
}
