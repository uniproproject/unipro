package com.unipro.web.websocket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;
import org.springframework.web.socket.server.endpoint.SpringConfigurator;

import com.unipro.model.Student;

@ServerEndpoint(value = "/uniprows", configurator=SpringConfigurator.class)
public class UniproEndpoint {

	private static final org.slf4j.Logger LOGGER = LoggerFactory
			.getLogger(UniproEndpoint.class);

//	private static Session professorSession;
//	
//	private static Map<Student, Session> studentSessionMap = new ConcurrentHashMap<>();
//	
	
	
	
	/**
	 * 
	 */
	public UniproEndpoint() {
		
	}
	
	
	/* here session correspond to alum or professor */
	@OnOpen
	public void onOpen(Session session) {
		LOGGER.info("Opening connection ...");
		// TODO send message to professor thar a new alum is connected
		
		
		//set the professor session
		UniproEndpoint.discoverProfessorSession(session);
		

	}
	


	@OnMessage
	public void onMessage(Session session, String message) {
		LOGGER.info("received message");
		//TODO: here all messages from whatever client (could be alums or professor).
		//pseudocode: 
				//if alum , send message to professor
				//else if professor, send message to concrete alum.
		
		if(session == professorSession) {
			//Send message to alumn
		} else {
			//send message to professor
		}
		
		
	}

	@OnClose
	public void closedConnection(Session session) {
		
		LOGGER.info("Connection closed.");
		//TODO: delete session
	}

	@OnError
	public void error(Session session, Throwable t) {
		LOGGER.info("Error...");
	}

}
