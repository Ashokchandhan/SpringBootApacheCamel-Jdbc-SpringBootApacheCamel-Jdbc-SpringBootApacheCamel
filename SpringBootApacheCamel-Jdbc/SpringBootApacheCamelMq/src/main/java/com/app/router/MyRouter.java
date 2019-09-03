package com.app.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:d:/desti?fileName=mydata.txt").to("jms:queue:one");
		
	}

}
