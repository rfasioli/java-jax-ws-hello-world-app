package br.com.rfasioli.endpoint;

import javax.xml.ws.Endpoint;

import br.com.rfasioli.ws.HelloWorldImpl;

//Endpoint publisher
public class HelloWorldPublisher{
	
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }

}