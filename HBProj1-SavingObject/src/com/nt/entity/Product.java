//Entity class/ Domain class/model class/Persistent class/POJO class/HLO(hibernate language object) class

package com.nt.entity;

import java.io.Serializable;

public class Product implements Serializable {
//bean properties
	private int pid = 0;
	private String pname = null;
	private float price = 0.0f;
	private float qty = 0.0f;

	// setter and getter methods
	// alt + shift s,r
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getQty() {
		return qty;
	}

	public void setQty(float qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + "]";
	}

}
