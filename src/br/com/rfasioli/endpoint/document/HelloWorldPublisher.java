package br.com.rfasioli.endpoint.document;

import javax.xml.ws.Endpoint;

import br.com.rfasioli.ws.document.HelloWorldImpl;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:8888/ws/hello", new HelloWorldImpl());
	    }
	
}
