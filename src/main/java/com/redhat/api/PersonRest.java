package com.redhat.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.redhat.test.Person;

@Path("/personRest/")
@Produces({MediaType.APPLICATION_JSON})
public class PersonRest {
	
	@GET
    @Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
    public Person getPerson(@PathParam("id") String personId) {
		Person p = new Person();
		p.setId(personId);
		p.setDocument("123");
		p.setName("Doe");
        return p;
    }
	
}
