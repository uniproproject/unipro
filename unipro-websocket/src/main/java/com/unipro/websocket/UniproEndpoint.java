package com.unipro.websocket;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;

@ServerEndpoint(value = "/uniprows")
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
		
		
		
	}
	


	@OnMessage
	public void onMessage(Session session, String message) {
		LOGGER.info("received message");
		//TODO: here all messages from whatever client (could be alums or professor).
		//pseudocode: 
				//if alum , send message to professor
				//else if professor, send message to concrete alum.
		
		
		
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
