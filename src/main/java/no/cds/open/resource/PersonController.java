package no.cds.open.resource;

import no.cds.open.domain.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/persons")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonController {
    @GET
    public List<Person> getAll() {
        return Person.listAll();
    }

    @GET
    @Path("/{id}")
    public Person getOne(@PathParam(value = "id") long id) {
        return Person.findById(id);
    }
}
