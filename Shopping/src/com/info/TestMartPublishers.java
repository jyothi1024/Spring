package com.info;

import javax.xml.ws.Endpoint;

public class TestMartPublishers {
	
	public static void main(String[] args) {
		
    Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog())	;	
	}

}
