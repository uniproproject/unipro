package com.unipro.service.common;

import javax.xml.ws.ServiceMode;

import com.unipro.service.TestService;



public class TestServiceImpl implements TestService {

	@Override
	public void doNothing() {
		System.out.println("HOLA CARACOLA");
	}

}
