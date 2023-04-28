package com.example.demo.web.rest;

import com.example.demo.domain.Cathegorie;
import com.example.demo.service.ArticleService;
import com.example.demo.service.CathegorieService;
import com.example.demo.service.DTO.ArticleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/v1")
@RestController
public class CathegorieRessource {
    @Autowired
    CathegorieService cathegorieService;

    @GetMapping("/cathegories")
    public List<Cathegorie> getusers() {
        return cathegorieService.getall();
    }

    @PostMapping("/cathegories")
    public Cathegorie add(Cathegorie c ) {
        return cathegorieService.add(c);
    }

    @PutMapping("/cathegories")
    public Cathegorie update(Cathegorie c ) {
        return cathegorieService.add(c);
    }

    @GetMapping("/cathegories/{id}")
    public Cathegorie getbyId(@PathVariable Long id) {
        return cathegorieService.getById(id);
    }

    @DeleteMapping("/cathegories/{id}")
    public boolean delete(@PathVariable Long id) {
        try {
            cathegorieService.delete(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
