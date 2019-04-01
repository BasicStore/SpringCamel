package com.camel.serv;
import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.camel.config.MyRoute1;

@Service
public class MyCamelService {

	public MyCamelService(CamelContext camelContext) {
		try {
			System.out.println("Init MyCamel service 999.........");
			camelContext.addRoutes(new MyRoute1());
			
			//camelContext.addRoutes(myRoute1);  // FOR SOME REASON THIS IS NOT AUTOWIRING MyRoute1!!!!!
			
			System.out.println("AUTOWIRED route added!!!.........");
			camelContext.start();
			System.out.println("Context started.........keep chugging along for 5 minutes");
			Thread.sleep(5 * 60 * 1000); // 
			camelContext.stop();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
}
