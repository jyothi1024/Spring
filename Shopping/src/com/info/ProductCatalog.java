package com.info;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.info.business.ProductServiceImpl;
import com.info.model.Product;

@WebService(endpointInterface="com.info.ProductCatalogInterface" ,portName="TestMartCatlogPort" ,serviceName="TestMartCatlogService" )
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see com.info.ProductCatlogInterface#getProductCategories()
	 */
	@Override
	@WebMethod
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see com.info.ProductCatlogInterface#getProducts(java.lang.String)
	 */
	@Override
	@WebMethod(exclude=true)
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	 
	/* (non-Javadoc)
	 * @see com.info.ProductCatlogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	@WebMethod(exclude=true)
	public boolean addProduct(String category,String product) {
		return productService.addProduct(category,product);
	}
	
	@Override
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);

	}

	

	
		
	
}
