package com.co.ceiba.adn.domain.builder;

import com.co.ceiba.adn.domain.model.entities.Product;
import com.co.ceiba.adn.domain.model.entities.SalesDetail;
import com.co.ceiba.adn.domain.model.entities.SalesHeader;

public class SalesDetailTestDataBuilder {
     Long id;
     Product product;
     SalesHeader header;
     Long qtyPurchased;
     Long total;
     
     public SalesDetailTestDataBuilder() {
		id= 1L;
		product = new Product(0L,"000001", "Prueba", 100L,200D);
		header = new SalesHeader("Cliente prueba", "01/01/2019", 10D);
		qtyPurchased = 1L;
		total = 10L;
	}
     
     public SalesDetailTestDataBuilder withHeader(SalesHeader header) {
    	 this.header = header;
    	 return this;
     }
     
     public SalesDetailTestDataBuilder withProduct(Product product) {
    	 this.product = product;
    	 return this;
     }
     public SalesDetailTestDataBuilder withQtyPurchased(Long qtyPurchased) {
    	 this.qtyPurchased = qtyPurchased;
    	 return this;
     }
     
     public SalesDetailTestDataBuilder withTotal(Long total) {
    	 this.total = total;
    	 return this;
     }
     
    public SalesDetail build() {
    	return new SalesDetail(header, product, qtyPurchased, total);
    }
}
