package com.bootStoreProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MyCloth")
public class MyClothList {
    
	@Id
	private int id;
    private String name;
    private String material;
    private String price;
    
    public MyClothList(int id, String name, String material, String price) {
		super();
		this.id = id;
		this.name = name;
		this.material = material;
		this.price = price;
	}
	 public MyClothList() {
			super();
			// TODO Auto-generated constructor stub
	}
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
    
	
}
