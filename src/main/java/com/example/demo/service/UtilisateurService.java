package com.example.demo.service;

import com.example.demo.domain.Utilisateur;
import com.example.demo.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    public Utilisateur save(Utilisateur u){
        return utilisateurRepository.save(u);
    }

    public Utilisateur update(Utilisateur u){
        return utilisateurRepository.save(u);
    }

    public List<Utilisateur> getall(){
        return utilisateurRepository.findAll();
    }

    public Utilisateur getById(Long id){
        return utilisateurRepository.findById(id).orElseThrow();
    }


    public void delete(Long id){
        utilisateurRepository.deleteById(id);
    }

}
