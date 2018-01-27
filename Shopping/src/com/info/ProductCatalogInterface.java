package com.info;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.info.model.Product;

@WebService(name="TestMartCatalog" ,targetNamespace ="http://testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action="fetch categories" , operationName="fetchCategories")
	List<String> getProductCategories();
    
	@WebMethod
	List<String> getProducts(String category);
	
    @WebMethod
	boolean addProduct(String category, String product);
    
    @WebMethod
    List<Product> getProductsv2(String category);

}