package com.camel.config;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class MyRoute1 extends RouteBuilder {

	
	public MyRoute1() {
		
	}
	
	
  @Override
  public void configure() throws Exception {
	  System.out.println("in configuration method in RouteBuilder");

// HARD CODED ENDPOINTS:	  
//	  from("file:tmp/input?move=./done")
//      	.to("file:tmp/output");	  
	  
	  System.out.println("FROM PROPS FILE......");
	  from("{{route.abc123.from}}")
	  	.process(new CustomProcessor())                      // process 
	  	.bean(new CustomTransformer(), "transformContent")   // transform
	  .to("{{route.abc123.to}}");
  }
  
}