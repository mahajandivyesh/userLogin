package com.dvsapp.login.util;

import java.io.Serializable;

public class CommonResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean success;
	private Integer statusCode;
	private Object resp;
	private String message;


	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public Object getResp() {
		return resp;
	}

	public void setResp(Object resp) {
		this.resp = resp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CommonResponse [success=" + success + ", statusCode=" + statusCode + ", resp=" + resp + ", message="
				+ message + "]";
	}



	
}
