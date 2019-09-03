package com.app;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub

		from("jms:queue:abc").to("file:d:/desti?fileName=mydata.txt");
	}


}
