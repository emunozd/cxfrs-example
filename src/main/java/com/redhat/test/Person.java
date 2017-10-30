package com.redhat.test;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	private String document;
	
	private String id;

	private String name;

	public Person() {
	}


	public String getDocument() {
		return this.document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}