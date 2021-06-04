package com.technoelevate.restaurant;

import java.util.LinkedHashMap;

public class Items {
    
//LinkedHashMap<String, Double> linkedHashMap=new LinkedHashMap<String, Double>();
//
//public void gravies() {
//	linkedHashMap.put("KajuMasala", 150.00);
//	linkedHashMap.put("PannerMasala", 125.00);
//	linkedHashMap.put("KurmaBhaji", 90.00);
//	linkedHashMap.put("ChikenMasala",160.00);
//}
//
//
//public void breads() {
//	linkedHashMap.put("Chapati", 20.00);
//	linkedHashMap.put("Roti", 25.00);
//	linkedHashMap.put("Paratha", 30.00);
//	linkedHashMap.put("AluPratha", 150.00);
//}
//
//public void riceItem() {
//	linkedHashMap.put("Birayani", 150.00);
//	linkedHashMap.put("PalakPanner", 170.00);
//	linkedHashMap.put("GheeRice", 130.00);
//	linkedHashMap.put("FriedRice", 190.00);
//}


public	String items;
public	double price;
public int id;
public Items(String items, double price, int id) {
	super();
	this.items = items;
	this.price = price;
	this.id = id;
}


}
