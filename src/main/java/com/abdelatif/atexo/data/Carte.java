/**
 * @author MEHELLOU Abdelatif
 * */
package com.abdelatif.atexo.data;
public class Carte {
	private String couleur;
	private String valeur;
	
	public Carte() {
	}
	
	public Carte(String couleur, String valeur) {
		super();
		this.couleur = couleur;
		this.valeur = valeur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	
	@Override
	public String toString() {
		return "["+couleur+" , "+valeur+"]";
	}
}
