package com.apex.server;

public class BasicCalc implements Calc {
	
	/* (non-Javadoc)
	 * @see com.apex.server.Calc#add(int, int)
	 */
	public int add(int i, int j){
		return i+j;
	}
	
	/* (non-Javadoc)
	 * @see com.apex.server.Calc#subtract(int, int)
	 */
	public int subtract(int i, int j){
		return i-j;
	}
	
	/* (non-Javadoc)
	 * @see com.apex.server.Calc#prod(int, int)
	 */
	public int prod(int i, int j){
		return i*j;
	}
	
	/* (non-Javadoc)
	 * @see com.apex.server.Calc#div(int, int)
	 */
	public int div(int i, int j){
		return i/j;
	}
	
	

}
