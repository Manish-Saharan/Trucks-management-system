package com.Kaiburr.Task1.Controller;

import com.Kaiburr.Task1.Model.Server;
import com.Kaiburr.Task1.Repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")

public class Scontroller {
    @Autowired
    ServerRepository repo;

    //Function to get the list of all Servers
    @GetMapping("/servers")
    public List<Server> getAllServers(){

        return repo.findAll();
    }

    //Function to add a new Server to the database
    @PostMapping("/servers")
    public Server addServer(@RequestBody Server ser){

        if (repo.existsById(ser.getId())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Server already exists");
        }
        return repo.save(ser);
    }

    //Function to find a Server by ID
    @GetMapping("/server/{ID}")
    public Server getServersByID(@PathVariable String ID){

        Server serv= repo.findAllByID(ID);

        if(serv==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Server ID not found");
        }
        return serv;
    }

    //Function to find a Server by name
    @GetMapping("/servers/{text}")
    public List<Server> getServersByName(@PathVariable String text){

        List<Server> serv= repo.findBynameContainingIgnoreCase(text);

        if(serv==null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Server not found");
        }
        return serv;
    }

    @DeleteMapping("/deleteserver/{ID}")
    public void deleteServer(@PathVariable String ID){

        Server serv= repo.findAllByID(ID);

        if(serv==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Server ID not found");
        }
        repo.deleteByID(ID);
    }


}
