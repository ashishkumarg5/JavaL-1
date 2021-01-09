package com.learn.java.inheritance;

public class NonMetro extends City{

	private int subDivisions;
	
	public NonMetro(String a, String b) {
		super(a,b);
	}

	/**
	 * @return the subDivisions
	 */
	public int getSubDivisions() {
		return subDivisions;
	}

	/**
	 * @param subDivisions the subDivisions to set
	 */
	public void setSubDivisions(int subDivisions) {
		this.subDivisions = subDivisions;
	}
	
	
}
