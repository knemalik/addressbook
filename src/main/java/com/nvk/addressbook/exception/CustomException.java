	package com.nvk.addressbook.exception;

public class CustomException extends Exception{

	private static final long serialVersionUID = 1L;

	public String code;
	
	public String status;
	
	public String message;
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
