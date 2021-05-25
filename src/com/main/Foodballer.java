package com.main;

import java.util.concurrent.ConcurrentHashMap;

public class Foodballer implements Comparable<Foodballer>{

	ConcurrentHashMap al;
	private String name;
	private int jerseyId;
	
	@Override
	public int compareTo(Foodballer o) {
		return this.getName().compareTo(o.getName());
	}
	
	@Override
	public String toString() {
		return "Foodballer [name=" + name + ", jerseyId=" + jerseyId + "]";
	}
	public Foodballer(String name, int jerseyId) {
		super();
		this.name = name;
		this.jerseyId = jerseyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJerseyId() {
		return jerseyId;
	}
	public void setJerseyId(int jerseyId) {
		this.jerseyId = jerseyId;
	}
	
	
}
