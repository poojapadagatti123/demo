package com.technoelevate.restaurant;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		DisplayItems displayItems=new DisplayItems();
		GenerateBill generateBill=new GenerateBill();
		System.out.println();
		System.out.println("************************Welcome to FoodCastel**************************");
        System.out.println();
		displayItems.display();
	    System.out.println("Enter the number of items");
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    System.out.println("Enter the food items using id");
	    for(int i=0;i<a.length;i++) {
	    	a[i]=sc.nextInt();
	    }
	    System.out.println("your slected Items are:");
	    generateBill.selectedItems(a);
	    System.out.println("your total amount is");
	    generateBill.getAmount(a);
	    
	    System.out.println("your order is succefull");
	    
	
	
	
	
	
	
	
	
	}
	
	

}
