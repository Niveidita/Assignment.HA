package com.healthasyst.shoppingcart;

//Assignment - Day 3&4 
public class Items {
	private int id;
	private String description;
	private int quantity;
	private double price;
	
	public Items(String description, int quantity, double price) {
		this.description = description;
		this.quantity = quantity;
		this.setPrice(price);
	}
	

	//----------------------------------------------------
	// setter for Description and Quantity
	public void setDescription(String description) 
		{
			this.description = description;
		}

	public String getDescription() 
		{
			return this.description;
		}
//----------------------------------------------------
	public void setQuantity(int quantity)
		{
			if (quantity > 0) 
			{
				this.quantity = quantity;
			}
		}

	public int getQuantity()
		{
			return this.quantity;
		}

//---------------------------------------

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}

