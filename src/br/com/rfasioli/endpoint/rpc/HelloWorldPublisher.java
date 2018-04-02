package br.com.rfasioli.endpoint.rpc;

import javax.xml.ws.Endpoint;

import br.com.rfasioli.ws.rpc.HelloWorldImpl;

//Endpoint publisher
public class HelloWorldPublisher{
	
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }

}