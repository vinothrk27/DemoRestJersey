package com.fastfire.DemoRestJersey;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fastfire.Repository.AlienRepository;
import com.fastfire.bean.Alien;

@Path("aliens")
public class AlienResource {

	AlienRepository repo = new AlienRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Alien> getAliens() {
		return repo.getAliens();
	}
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien getAlien(@PathParam("id") int id)
	{
		return repo.getAlien(id);
	}
	
	@POST
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Alien> addAlien(Alien a)
	{
		System.out.println("Add method called");
		repo.addAlien(a);
		return repo.getAliens();
	}
	
	@PUT
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Alien> updateAlien(Alien a)
	{
		repo.updateAlien(a);
		return repo.getAliens();
	}
	
	@DELETE
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Alien> deleteAlien(Alien a)
	{
		repo.deleteAlien(a);
		return repo.getAliens();
	}
}
