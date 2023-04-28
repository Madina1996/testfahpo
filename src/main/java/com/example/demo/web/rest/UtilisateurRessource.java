package com.example.demo.web.rest;
import com.example.demo.domain.Utilisateur;
import com.example.demo.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class UtilisateurRessource {

    @Autowired
    UtilisateurService utilisateurService;

  @GetMapping("/users")
    public List<Utilisateur> getusers() {
        return utilisateurService.getall();
    }

    @PostMapping("/users")
    public Utilisateur add(Utilisateur u ) {
        return utilisateurService.save(u);
    }

    @PutMapping("/users")
    public Utilisateur update(Utilisateur u ) {
        return utilisateurService.save(u);
    }

    @GetMapping("/users/{id}")
    public Utilisateur getbyId(@PathVariable Long id) {
        return utilisateurService.getById(id);
    }

    @DeleteMapping("/users/{id}")
    public boolean delete(@PathVariable Long id) {
      try {
           utilisateurService.delete(id);
           return true;
      }catch (Exception e){
          return false;
      }

    }

}
