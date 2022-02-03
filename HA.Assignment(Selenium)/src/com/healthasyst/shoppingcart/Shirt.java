package com.healthasyst.shoppingcart;

//Assignment - Day 3&4 
public class Shirt extends Items {

	private char size;
	private char colorCode;

	public Shirt(char size, char colorCode, String description, int quantity, double price) {
		super(description, quantity, price);
		this.size = size;
		this.colorCode = colorCode;
	}
	public void display() {
		System.out.println(this.size);
		System.out.println(this.colorCode);
		System.out.println(super.getDescription());
		System.out.println(super.getQuantity());
		System.out.println(super.getPrice());
	}
}
