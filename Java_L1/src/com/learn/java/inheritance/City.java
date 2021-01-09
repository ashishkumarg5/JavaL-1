package com.learn.java.inheritance;

public class City {
	private String cityName;
	private String cityState;
	
	public City(String cityName, String cityState) {
		this.cityName = cityName;
		this.cityState = cityState;
		System.out.println(this.cityName + " " + this.cityState);
	}
	
	public City() {
		//System.out.println("Parent : no-arg constructor");
		System.out.println("City called");
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the cityState
	 */
	public String getCityState() {
		return cityState;
	}

	/**
	 * @param cityState the cityState to set
	 */
	public void setCityState(String cityState) {
		this.cityState = cityState;
	}
	
}
