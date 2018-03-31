package br.com.rfasioli.ws;

import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "br.com.rfasioli.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
 
}