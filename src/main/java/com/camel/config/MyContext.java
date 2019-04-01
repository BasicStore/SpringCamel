package com.camel.config;
import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.camel.serv.MyCamelService;

@Configuration
public class MyContext {

  @Autowired
  CamelContext camelContext;

  
// CODE BELOW IS NOT NECESSARY  
//  @Bean
//  MyCamelService myService() {
//	  System.out.println("Initializing camel context.........");
//    return new MyCamelService(camelContext);
//  }
}
