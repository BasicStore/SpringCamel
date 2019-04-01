package com.camel.config;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CustomProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		System.out.println("Starting processor.........");
		System.out.println("LOGGING THE CONTENT OF FILE BEFORE MOVING OR TRANSFORMATION ==>" + exchange.getIn().getBody(String.class));
		System.out.println("message Id = " + exchange.getIn().getMessageId());
		System.out.println("exchange Id = " + exchange.getIn().getExchange().getExchangeId());
		System.out.println("exchange obj string (,uch the same as the exchangeId) = " + exchange.getIn().getExchange().toString());
	}
	
}
