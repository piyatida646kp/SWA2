package com.swa.oop1;

public class Product {
	    private String productID;
	    private String productName;
	    Product(String pid, String pname){
	      productID = pid;
	      productName = pname;
	    }
	    public String getDetailProduct(){
	      return "Product ID : "+productID+" and Product Name : "+productName;
	    }
	}

