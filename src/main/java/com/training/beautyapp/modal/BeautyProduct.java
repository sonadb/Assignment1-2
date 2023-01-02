package com.training.beautyapp.modal;

public class BeautyProduct {
		
	private int Product_Id; 
	private String Product_name; 
	private double Product_price; 
	private int Product_quantity;
	
	public BeautyProduct() {
		super();
	}
	
	public BeautyProduct(int Product_Id,String Product_name, double Product_price, int Product_quantity) {
		super();
	this.Product_Id = Product_Id;
	this.Product_name = Product_name;
	this.Product_price = Product_price;
	this.Product_quantity = Product_quantity;
	}
	
	public String addProduct(int Product_quantity) {
		return null;
	}
	
	public String updateProduct(int Product_quantity) {
		return null;
	}
	
	public String toString() {
		return "BeautyProducts [Product_Id : "+Product_Id+" , Product_name : "+Product_name+" , Product_price : "+Product_price+" ,"
				+ " Product_quantity : "+Product_quantity+" ] ";
		
	}
}
