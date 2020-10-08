package br.com.softblue.bluefood.application.service;

@SuppressWarnings("serial")
public class AplicationServiceException extends RuntimeException {

	public AplicationServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public AplicationServiceException(String message) {
		super(message);
	}

	public AplicationServiceException(Throwable cause) {
		super(cause);
	}

}
