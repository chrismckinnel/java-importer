package com.tangentsnowball.entity.enums;

public enum BookType {
	FICTION ("Fiction"), NONFICTION ("Non-Fiction");
	String value;
	
	BookType(String value) {
		this.value = value;
	}
	
	public static BookType fromString(String value) {
		for (BookType type: BookType.values()) {
			if (type.toString().equals(value)) {
				return type;
			}
		}
		throw new IllegalArgumentException(String.format("%s not found in BookTypes", value));
	}
}