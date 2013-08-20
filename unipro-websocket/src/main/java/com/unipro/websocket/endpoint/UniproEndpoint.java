package com.unipro.websocket.endpoint;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;
import org.springframework.web.socket.server.endpoint.SpringConfigurator;

import com.unipro.websocket.api.Talker;

/**
 * @author juanfe
 *
 */
@ServerEndpoint(value = "/uniprows/{id}", configurator=SpringConfigurator.class)
public class UniproEndpoint {

	private static final org.slf4j.Logger LOGGER = LoggerFactory
			.getLogger(UniproEndpoint.class);


	
	private static Session tutorSession;
	
	/**
	 * The talker for this websocket instance 
	 */
	private Talker talker;
	
	

	
	
	/**
	 * 
	 */
	public UniproEndpoint() {
		
	}
	
	
	
	@OnOpen
	public void onOpen(Session session, @PathParam("id") String id) {
		
		if(id.equalsIgnoreCase("diego")) {
			tutorSession = session;
		} else {
			try {
				tutorSession.getBasicRemote().sendText("Alumn whith session = " + session.getId() + " connected.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
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
