package com.camel.config;


public class CustomTransformer {

	public String transformContent(String body) {
		
		System.out.println("Invoking transformer.........");
		
		if (body == null) {
			return "";
		}
		
		String upperCaseContent = body.toUpperCase();
		return upperCaseContent.replaceAll("LOWER CASE", "UPPER CASE");
	}
	
	
	
	
}
