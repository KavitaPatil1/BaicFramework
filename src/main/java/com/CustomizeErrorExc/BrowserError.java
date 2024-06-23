package com.CustomizeErrorExc;

public class BrowserError  extends Error{

	@Override
	public String getMessage() {
		
		return "invalid browser name";
	}
	
	
	
	

}

