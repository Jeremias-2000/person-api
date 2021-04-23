package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.exception.PersonNotFoundException;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public interface PersonRequests {

    @PostMapping
    MessageResponseDTO createPerson(@RequestBody  @Valid PersonDTO personDTO);

    @GetMapping
    ResponseEntity<?> listAll();

    @GetMapping("/{id}")
    ResponseEntity<?>  findById(@PathVariable Long id) throws PersonNotFoundException;

    @PutMapping("/{id}")
    MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO)
            throws PersonNotFoundException;
    @DeleteMapping
    ResponseEntity<?> deleteById(@PathVariable Long id) throws  PersonNotFoundException;
}
