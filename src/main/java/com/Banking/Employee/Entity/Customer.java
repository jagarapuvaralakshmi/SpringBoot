package com.Banking.Employee.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table

public class Customer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cno;
	
	private String cname;
	private int cage;
	private String ctype;
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCage() {
		return cage;
	}
	public void setCage(int cage) {
		this.cage = cage;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public Customer(int cno, String cname, int cage, String ctype) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.cage = cage;
		this.ctype = ctype;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", cage=" + cage + ", ctype=" + ctype + "]";
	}
	
	
	
	
}
