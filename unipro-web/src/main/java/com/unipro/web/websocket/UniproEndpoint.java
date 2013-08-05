package com.unipro.web.websocket;

import java.util.logging.Logger;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.LoggerFactory;

@ServerEndpoint(value = "/uniprows")
public class UniproEndpoint {

	private static final org.slf4j.Logger LOGGER = LoggerFactory
			.getLogger(UniproEndpoint.class);

	private static Session principal;

	private static void setPrincipal(Session session) {
		UniproEndpoint.principal = session;
	}

	public UniproEndpoint() {

	}

	@OnOpen
	public void onOpen(Session session) {
		LOGGER.info("Opening connection ...");
		if (UniproEndpoint.principal == null) {
			UniproEndpoint.setPrincipal(session);
		}

	}

	@OnClose
	public void closedConnection(Session session) {
		LOGGER.info("Connection closed.");
	}

	@OnError
	public void error(Session session, Throwable t) {
		LOGGER.info("Error...");
	}

}
