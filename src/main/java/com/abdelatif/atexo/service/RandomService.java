/**
 * @author MEHELLOU Abdelatif
 * */
package com.abdelatif.atexo.service;

import java.util.List;

import com.abdelatif.atexo.data.Carte;

public interface RandomService {
	List<Carte> getRandomCarteList(int nbElements);
}
