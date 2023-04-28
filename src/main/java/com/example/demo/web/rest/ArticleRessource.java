package com.example.demo.web.rest;

import com.example.demo.domain.Utilisateur;
import com.example.demo.service.ArticleService;
import com.example.demo.service.DTO.ArticleDTO;
import com.example.demo.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/v1")
@RestController
public class ArticleRessource {

    @Autowired
    ArticleService articleService;

    @GetMapping("/articles")
    public List<ArticleDTO> getusers() {
        return articleService.getall();
    }

    @PostMapping("/articles")
    public ArticleDTO add(ArticleDTO a ) {
        return articleService.add(a);
    }

    @PutMapping("/articles")
    public ArticleDTO update(ArticleDTO a ) {
        return articleService.add(a);
    }

    @GetMapping("/articles/{id}")
    public ArticleDTO getbyId(@PathVariable Long id) {
        return articleService.getById(id);
    }

    @DeleteMapping("/articles/{id}")
    public boolean delete(@PathVariable Long id) {
        try {
            articleService.delete(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
