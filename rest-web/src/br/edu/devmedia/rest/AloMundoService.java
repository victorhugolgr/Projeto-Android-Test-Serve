package br.edu.devmedia.rest;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.edu.devmedia.domain.Pessoa;
import br.edu.devmedia.uitl.Constantes;

@Path("/alo")
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
	
	@POST
	@Path("/json")
	@Produces(Constantes.APPLICATION_JSON_UTF8)
	@Consumes(Constantes.APPLICATION_JSON_UTF8)
	public Pessoa testJson(){
		Pessoa p = new Pessoa();
		p.setNome("João");
		
		List<Pessoa> filhos = new ArrayList<Pessoa>();
		
		for (int i = 1; i <= 5; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome("Filho " + i);
			
			filhos.add(pessoa);
		}
		
		p.setFilhos(filhos);
		
		return p;
	}
}