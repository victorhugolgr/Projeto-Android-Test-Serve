package br.edu.devmedia.rest;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class AloMundoService {

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_PLAIN)
	public String aloMundoGet(@QueryParam("msg") String msg) {
		return "Alô Mundo GET! msg = " + msg;
	}

	@POST
	public String aloMundoPost() {
		return "Alô Mundo POST!";
	}
	
	@GET
	@Path("/param/{msg}")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.TEXT_PLAIN)
	public String testeParam(@PathParam("msg") String msg) {
		return "Param = " + msg;
	}
}