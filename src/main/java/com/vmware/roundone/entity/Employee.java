package com.vmware.roundone.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee {

	String eid;
	String ename;
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Employee() {
		
	}
	public Employee(String eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
	
	
	
	
}
