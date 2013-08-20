package com.unipro.websocket.impl;

import com.unipro.websocket.api.Talker;

public class StudentTalker implements Talker {
	
	private Talker tutorTalker;
	
	public StudentTalker(Talker tutorTalker) {
		this.tutorTalker = tutorTalker;
	}

	@Override
	public void onMessage() {
		

	}

	@Override
	public void sendMessage() {
		

	}

}
