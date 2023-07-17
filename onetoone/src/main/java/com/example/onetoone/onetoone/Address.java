package com.example.onetoone.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="addres_id")
	private int addresid;
	private String city;
	@Column(name="addres_type")
	private String addrestype;
	public Address() {
		super();
	}
	public Address(int addresid, String city, String addrestype) {
		super();
		this.addresid = addresid;
		this.city = city;
		this.addrestype = addrestype;
	}
	public int getAddresid() {
		return addresid;
	}
	public void setAddresid(int addresid) {
		this.addresid = addresid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddrestype() {
		return addrestype;
	}
	public void setAddrestype(String addrestype) {
		this.addrestype = addrestype;
	}
	@Override
	public String toString() {
		return "Address [addresid=" + addresid + ", city=" + city + ", addrestype=" + addrestype + "]";
	}
	

}
