package com.springBoot.model;

public class Products {
    int id;
    String name;
    String type;

    public Products() {
    }

    public Products(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
    
}
