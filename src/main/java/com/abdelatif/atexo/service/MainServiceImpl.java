/**
 * @author MEHELLOU Abdelatif
 * */
package com.abdelatif.atexo.service;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdelatif.atexo.data.ResponseObject;

@Service
public class MainServiceImpl implements MainService {
	
	public static final int NBR_CARTE = 10; 
	
	@Autowired
	private RandomService randomService;
	
	@Autowired
	private OrderService orderService;
	
	@Override
	public ResponseObject essaiJeu() {
		ResponseObject essai = new ResponseObject();
		essai.setColorOrder(orderService.getColorOrder());
		essai.setValueOrder(orderService.getValueOrder());
		essai.setNonOrderedCartes(randomService.getRandomCarteList(NBR_CARTE));
		essai.setOrderedCartes(orderService.getOrderedCarteList(new ArrayList<>(essai.getNonOrderedCartes()),
				essai.getColorOrder(), essai.getValueOrder()));
		return essai;
	}

}
