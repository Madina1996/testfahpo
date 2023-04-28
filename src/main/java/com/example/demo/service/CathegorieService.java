package com.example.demo.service;

import com.example.demo.domain.Cathegorie;
import com.example.demo.repository.CathegorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CathegorieService {
    @Autowired
    CathegorieRepository cathegorieRepository;

    public Cathegorie add(Cathegorie c){
        return cathegorieRepository.save(c);
    }

    public Cathegorie update(Cathegorie c){
        return cathegorieRepository.save(c);
    }

    public List<Cathegorie> getall(){
        return cathegorieRepository.findAll();
    }

    public Cathegorie getById(Long id){
        return cathegorieRepository.findById(id).orElseThrow();
    }


    public void delete(Long id){
         cathegorieRepository.deleteById(id);
    }


}
