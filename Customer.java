package Project_02;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {
	private String fname;
	private String lname;
	private String email;
	private String number;
	private String address;
	private String[] rentals;
	public Customer(String fname, String lname, String email, String number, String address, String[] rentals) {
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.number=number;
		this.address=address;
		this.rentals=rentals;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String[] getRentals() {
		return rentals;
	}
	public void setRentals(String[] rentals) {
		this.rentals = rentals;
	}

}
