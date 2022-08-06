package com.gabrielpc.workshopmongo.service.exception;

public class ObjectNotFoundExcepetion extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundExcepetion(String msg) {
		super(msg);
	}
}
