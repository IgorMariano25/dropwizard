package com.example.helloworld.resources;

import com.example.helloworld.core.Administrador;
import com.example.helloworld.db.AdministradorDAO;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.validation.Valid;
import javax.ws.rs.GET;
import java.util.List;

@Path("/Dispositivo")
@Produces(MediaType.APPLICATION_JSON)
public class DispositivoResource {
    
}
