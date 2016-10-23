package br.edu.devmedia.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class AloMundoService {

	@GET
	public String aloMundo() {
		return "Alô Mundo!";
	}
}