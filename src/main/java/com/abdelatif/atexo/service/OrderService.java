/**
 * @author MEHELLOU Abdelatif
 * */
package com.abdelatif.atexo.service;
import java.util.List;

import com.abdelatif.atexo.data.Carte;

public interface OrderService {
	List<String> getColorOrder();
	List<String> getValueOrder();
	List<Carte> getOrderedCarteList(List<Carte> cartes, List<String> colorsOrder, List<String> valuesOrder);
}
