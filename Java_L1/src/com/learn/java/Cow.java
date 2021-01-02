package com.learn.java;

public class Cow extends Animal{
	String cowVoice;
	int cowHeight;
	
	
	public Cow(String cowVoice, int cowHeight) {
		super();
		this.cowVoice = cowVoice;
		this.cowHeight = cowHeight;
	}
	
	/**
	 * @return the cowVoice
	 */
	public String getCowVoice() {
		return cowVoice;
	}
	/**
	 * @param cowVoice the cowVoice to set
	 */
	public void setCowVoice(String cowVoice) {
		this.cowVoice = cowVoice;
	}
	/**
	 * @return the cowHeight
	 */
	public int getCowHeight() {
		return cowHeight;
	}
	/**
	 * @param cowHeight the cowHeight to set
	 */
	public void setCowHeight(int cowHeight) {
		this.cowHeight = cowHeight;
	}
	
	
	
}
