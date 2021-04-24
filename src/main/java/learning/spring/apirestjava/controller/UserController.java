package learning.spring.apirestjava.controller;

import learning.spring.apirestjava.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import learning.spring.apirestjava.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/api/users/{id}")
    public ResponseEntity show(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/users")
    public UserModel store(@RequestBody UserModel user) {
        return repository.save(user);
    }
}
