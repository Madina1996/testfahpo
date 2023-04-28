package com.example.demo.web.rest;

import com.example.demo.domain.Cathegorie;
import com.example.demo.service.CathegorieService;
import com.example.demo.service.CommantaireService;
import com.example.demo.service.DTO.CommentaireDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/v1")
@RestController
public class CommentaireRessource {
    @Autowired
    CommantaireService commantaireService;

    @GetMapping("/comments")
    public List<CommentaireDTO> getusers() {
        return commantaireService.getall();
    }

    @PostMapping("/comments")
    public CommentaireDTO add(CommentaireDTO c ) {
        return commantaireService.add(c);
    }

    @PutMapping("/comments")
    public CommentaireDTO update(CommentaireDTO c ) {
        return commantaireService.add(c);
    }

    @GetMapping("/comments/{id}")
    public CommentaireDTO getbyId(@PathVariable Long id) {
        return commantaireService.getById(id);
    }

    @DeleteMapping("/comments/{id}")
    public boolean delete(@PathVariable Long id) {
        try {
            commantaireService.delete(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }

}
