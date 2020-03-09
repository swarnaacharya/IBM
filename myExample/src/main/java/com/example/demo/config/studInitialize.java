package com.example.demo.config;



public class studInitialize {
	
	
	@SuppressWarnings("rawtypes")
	protected Class[] getRootConfigClasses() {
		return new Class[] { StudConfig.class };
	}

	@SuppressWarnings("rawtypes")
	protected Class[] getServletConfigClasses() {
		return null;
	}

	protected String[] getServletMappings() {
		return new String[] { "/" };
	}


}
