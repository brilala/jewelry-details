package com.hcl.web.model;

public class Jewelry {
	private int id;
	private String type;
	private String metal;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMetal() {
		return metal;
	}
	public void setMetal(String metal) {
		this.metal = metal;
	}
	@Override
	public String toString() {
		return "Jewelry [id=" + id + ", type=" + type + ", metal=" + metal + "]";
	}


}
