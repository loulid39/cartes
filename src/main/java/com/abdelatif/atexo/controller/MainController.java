/**
 * @author MEHELLOU Abdelatif
 * */

package com.abdelatif.atexo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abdelatif.atexo.data.Carte;
import com.abdelatif.atexo.data.ResponseObject;
import com.abdelatif.atexo.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService service;

	
	@GetMapping("/")
	public String index (Model model) {
	    return "index";
	}
		
	@RequestMapping("/test")
	@ResponseBody
	public ResponseObject faireUnEssai() {
		ResponseObject essai = service.essaiJeu();
		System.out.println("\nOrdre des couleurs : ");
		for(String e : essai.getColorOrder()) {
			System.out.print(e+" ");
		}
		System.out.println("\nOrdre valeurs : ");
		for(String e : essai.getValueOrder()) {
			System.out.print(e+" ");
		}
		System.out.println("\nCarte non ordonn�e : ");
		for(Carte c : essai.getNonOrderedCartes()) {
			System.out.print(c.toString()+" * ");
		}
		System.out.println("\nCarte ordonn�e : ");
		for(Carte c : essai.getOrderedCartes()) {
			System.out.print(c.toString()+" * ");
		}
		
		return essai;
	}
	
}
