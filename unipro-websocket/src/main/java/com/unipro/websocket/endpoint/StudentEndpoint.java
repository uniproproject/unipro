package com.unipro.websocket.endpoint;

import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.web.socket.server.endpoint.SpringConfigurator;

import com.unipro.websocket.wsmodel.StudentOnline;

@ServerEndpoint(value = "/student", configurator = SpringConfigurator.class)
public class StudentEndpoint {
	
	private StudentOnline studentPeer;

	@OnOpen
	public void onOpen(Session session, String message) {

	}

	@OnMessage
	public void onMessage(String message) {

	}

	@OnClose
	public void onClose(String message, CloseReason closeReason) {

	}

}
