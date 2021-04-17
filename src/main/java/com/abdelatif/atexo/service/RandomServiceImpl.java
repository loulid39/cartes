/**
 * @author MEHELLOU Abdelatif
 * */
package com.abdelatif.atexo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdelatif.atexo.data.Carte;
import com.abdelatif.atexo.data.Couleurs;
import com.abdelatif.atexo.data.Valeurs;

@Service
public class RandomServiceImpl implements RandomService {

	@Autowired
	private Couleurs couleurs;
	
	@Autowired
	private Valeurs valeurs;
	
	@Override
	public List<Carte> getRandomCarteList(int nbElements) {
		/**
		 * une fonction qui renvoie une liste de carte tirer aléatoirement
		 * le nombre d'élement de la liste : nbElements
		 * */
		List<Carte> cartes = new ArrayList<Carte>();
		
		for(int i=0;i<nbElements;i++) {
			cartes.add(getRandomCarte());
		}
		
		return cartes;
	}
	
	private Carte getRandomCarte() {
		/**
		 * fonction qui renvoie une carte tirer aléatoirement
		 * */
		List<String> couleursList = new ArrayList<String>(couleurs.getCouleurs());
		List<String> valeursList = new ArrayList<String>(valeurs.getValeurs());
		Random ro = new Random();
		
		return new Carte(couleursList.get(ro.nextInt(couleursList.size())), valeursList.get(ro.nextInt(valeursList.size())));
	}

}
