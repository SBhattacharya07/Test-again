package com.vmware.roundone.entity;

import java.util.Date;

public class ErrorMessage {
	
	String Message;
	Date date;
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ErrorMessage(String message, Date date) {
		Message = message;
		this.date = date;
	}
	
	public ErrorMessage() {
	}
	
	

}
