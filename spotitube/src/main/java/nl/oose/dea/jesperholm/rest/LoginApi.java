package nl.oose.dea.jesperholm.rest;

import nl.oose.dea.jesperholm.dao.IUserDao;
import nl.oose.dea.jesperholm.rest.dto.TokenDTO;
import nl.oose.dea.jesperholm.rest.dto.UserDTO;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Path("/login")
public class LoginApi {

    @Inject
    private IUserDao userDao;

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(UserDTO userDTO) {
        String tokenString = userDao.login(userDTO.user, userDTO.password);
        TokenDTO tokenDTO = new TokenDTO();
        tokenDTO.user = userDTO.user;
        tokenDTO.token = tokenString;

        return Response.status(200).entity(tokenDTO).build();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "hallo! hallo!";
    }
}