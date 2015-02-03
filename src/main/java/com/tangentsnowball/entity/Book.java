package com.tangentsnowball.entity;

import java.util.HashSet;
import java.util.Set;

import com.tangentsnowball.entity.enums.BookType;

public class Book {
	private Set<Author> authors;
	private String title;
	private String description;
	private Integer published;
	private Integer pages;
	private BookType type;
	private Integer retail;
	private Set<Publisher> publishers;
	
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPublished() {
		return published;
	}
	public void setPublished(Integer published) {
		this.published = published;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Enum<?> getType() {
		return type;
	}
	public void setType(BookType type) {
		this.type = type;
	}
	public Integer getRetail() {
		return retail;
	}
	public void setRetail(Integer retail) {
		this.retail = retail;
	}
	public Set<Publisher> getPublishers() {
		if (publishers == null) {
			return new HashSet<>();
		}
		return publishers;
	}
	public void setPublishers(Set<Publisher> publishers) {
		this.publishers = publishers;
	}

}
