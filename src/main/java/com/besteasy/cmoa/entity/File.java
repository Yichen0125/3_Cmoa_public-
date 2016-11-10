package com.besteasy.cmoa.entity;

public class File {
	private Integer id;
	private String name;
	private String url;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public File(Integer id, String name, String url) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
	}
	public File() {
		super();
	}
	@Override
	public String toString() {
		return "File [id=" + id + ", name=" + name + ", url=" + url + "]";
	}
	
}
