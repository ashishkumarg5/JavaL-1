package com.learn.java;

public class Animal {
	private String name;
	private String colour;
	private boolean isWild;
	
	public Animal() {
		super();
	}
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal(String name, String colour, boolean isWild) {
		super();
		this.name = name;
		this.colour = colour;
		this.isWild = isWild;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	/**
	 * @return the isWild
	 */
	public boolean isWild() {
		return isWild;
	}
	/**
	 * @param isWild the isWild to set
	 */
	public void setWild(boolean isWild) {
		this.isWild = isWild;
	}
}
