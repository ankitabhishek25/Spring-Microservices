package com.cognizant.treatment.offerings.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement  //cause we want it to converted int json
public class ErrorMessage {
	public ErrorMessage() {
		super();
	}

	public ErrorMessage(String errorMessage, int errorCode, String documentation) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.documentation = documentation;
	}

	private String errorMessage;
	private int errorCode;
	private String documentation;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

}
