package com.africodecademy.demodocker.controller;

import com.africodecademy.demodocker.entity.PersonEntity;
import com.africodecademy.demodocker.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by momsboy on 3/26/21.
 */

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(path = "/getPersons")
    public ResponseEntity<?> getAll(HttpServletRequest httpServletRequest) {

        logger.info("getting all persons...");

        List<PersonEntity> response = personRepository.findAll();

        logger.info("Response size = " + response.size());

        return ResponseEntity.status(HttpStatus.OK).body(response);

    }
}
