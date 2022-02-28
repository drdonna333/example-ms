package com.drdonna.EXAMPLE.REPLACE.controllers.rests;

import com.drdonna.EXAMPLE.REPLACE.model.Example;
import com.drdonna.EXAMPLE.REPLACE.repository.interfaces.ICommonRepository;
import com.drdonna.EXAMPLE.REPLACE.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/player")
public class ExampleRestControllerDefinitions {

    @Autowired
    ICommonRepository repo;

    @Autowired
    ExampleService createPlayerService;

    @PostMapping("/create" )
    public ResponseEntity createPlayer(@RequestBody Example player) {
        createPlayerService.execute(player);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getPlayerById/{id}" )
    public ResponseEntity getExampleById(@PathVariable String id) { // call service that calls db service that calls repo
        Example player = repo.getExampleById(id);
        return new ResponseEntity<>(player, HttpStatus.OK);
    }

}

