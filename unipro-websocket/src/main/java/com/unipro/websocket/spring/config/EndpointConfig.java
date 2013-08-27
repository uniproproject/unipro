package com.unipro.websocket.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.socket.server.endpoint.ServerEndpointExporter;

import com.unipro.websocket.wsmodel.StudentPeer;
import com.unipro.websocket.wsmodel.TutorPeer;


@Configuration
public class EndpointConfig {
	
	@Bean
	public ServerEndpointExporter endpointExporter() {
		return new ServerEndpointExporter();
	}

	@Bean
	@Scope(value="prototype")
	public StudentPeer studentPeer() {
		return new StudentPeer();
	}
	
	@Bean
	@Scope(value="prototype")
	public TutorPeer tutorPeer() {
		return new TutorPeer();
	}

//	@Bean
//	public ServerEndpointRegistration echo() {
//		return new ServerEndpointRegistration("/echo", EchoEndpoint.class);
//	}
//
//	@Bean
//	public ServerEndpointRegistration echoSingleton() {
//		return new ServerEndpointRegistration("/echoSingleton", new EchoEndpoint(echoService()));
//	}

//	@Bean
//	public EchoAnnotatedEndpoint echoAnnotatedSingleton() {
//		return new EchoAnnotatedEndpoint(echoService());
//	}

//	@Bean
//	public EchoService echoService() {
//		return new DefaultEchoService("Did you say \"%s\"?");
//	}
	
	
	

}
