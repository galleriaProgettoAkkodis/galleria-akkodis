package com.progettogallery.exceptions;

import java.util.Date;

public class MessaggioErrore {
	private Date timeStamp;
	private int status;
	private String error;
	private String message;
	private String pathUri;
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getError() {
		return error;
	}
	
	public void setError(String error) {
		this.error = error;
	}
	
	public String getMessages() {
		return message;
	}
	
	public void setMessages(String message) {
		this.message = message;
	}
	
	public String getPathUri() {
		return pathUri;
	}
	
	public void setPathUri(String pathUri) {
		this.pathUri = pathUri;
	}
	
}