package com.springBoot.model;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    List<Products> prodList = new ArrayList<>();

    public ProductList() {
    }

    public ProductList(List<Products> prodList) {
        this.prodList = prodList;
    }

    public List<Products> getProdList() {
        return prodList;
    }

    public void setProdList(List<Products> prodList) {
        this.prodList = prodList;
    }

	@Override
	public String toString() {
		return "ProductList [prodList=" + prodList + "]";
	}
    
}