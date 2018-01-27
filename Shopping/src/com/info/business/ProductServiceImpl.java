package com.info.business;

import java.util.ArrayList;
import java.util.List;


import com.info.model.Product;


public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl() {
		
		bookList.add("java");
		bookList.add("Spring");
		bookList.add("Hibernate");
		
		musicList.add("PSPK");
		musicList.add("GANG");
		musicList.add("Simha");
		
		movieList.add("Regal");
		movieList.add("Amc");
		movieList.add("Frank");
		
	}
	
    public List<String> getProductCategories(){
		
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Movies");
		categories.add("Music");
		return categories;

    }
    public List<String> getProducts(String category){
    	switch(category.toLowerCase()) {
    	
    	case "books":
    		return bookList;
    	case "music":
    		return musicList;
    	case "movie":
    		return movieList;
    		
    	}
    	return null;
    }
    
    public boolean addProduct(String category , String product) {
		
    	switch(category.toLowerCase()) {
    	
    	case "books":
    		bookList.add(product);
    	case "music":
    		musicList.add(product);
    	case "movie":
    		movieList.add(product);
    	
    	}
    	return true;
    	
    	
    }

	public List<Product> getProductsv2(String category) {

		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Brains Book","1234",999.99));
		productList.add(new Product("Another Book","1234",120.99));

		
		return productList;
	}
    
}
