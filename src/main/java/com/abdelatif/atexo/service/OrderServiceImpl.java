/**
 * @author MEHELLOU Abdelatif
 * */
package com.abdelatif.atexo.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdelatif.atexo.data.Carte;
import com.abdelatif.atexo.data.Couleurs;
import com.abdelatif.atexo.data.Valeurs;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private Couleurs couleurs;
	
	@Autowired
	private Valeurs valeurs;
	
	@Override
	public List<String> getColorOrder() {
		/**
		 * fonction qui renvoie une liste des couleurs
		 * 
		 * chaque appelle à cette fonction revoie une liste avec
		 * un ordre différent
		 * */
		
		List<String> list = new ArrayList<String>(couleurs.getCouleurs());
		Collections.shuffle(list);
		
		return list;
	}

	@Override
	public List<String> getValueOrder() {
		/**
		 * fonction qui renvoie une liste des valeurs
		 * 
		 * chaque appelle à cette fonction revoie une liste avec
		 * un ordre différent
		 * */
		
		List<String> list = new ArrayList<String>(valeurs.getValeurs());
		Collections.shuffle(list);
		
		return list;
	}
 @Override
public List<Carte> getOrderedCarteList(List<Carte> cartes, List<String> colorsOrder, List<String> valuesOrder) {
	 /**
	  * fonction pour trier une liste de cartes
	  * @param1 cartes : liste des cartes non triés 
	  * @param2 colorsOrder : liste de l'ordre des couleurs
	  * @param3 valuesOrder : lisre de l'ordre des valeurs
	  * */
	 Comparator<Carte> byColor = (carte1, carte2) -> {
		 return Integer.compare(colorsOrder.indexOf(carte1.getCouleur()), colorsOrder.indexOf(carte2.getCouleur()));
	 };
	 Comparator<Carte> byValue = (carte1, carte2) -> {
		 return Integer.compare(valuesOrder.indexOf(carte1.getValeur()), valuesOrder.indexOf(carte2.getValeur()));
	 };
	
	
	cartes.sort(byColor.thenComparing(byValue));
	
	return cartes;
}
}
