package com.example.demo.service;

import com.example.demo.repository.ArticleRepository;
import com.example.demo.repository.CommentaireRepository;
import com.example.demo.service.DTO.ArticleDTO;
import com.example.demo.service.DTO.CommentaireDTO;
import com.example.demo.service.Mapper.ArticleMapper;
import com.example.demo.service.Mapper.CommentaireMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommantaireService {

    @Autowired
    CommentaireRepository commentaireRepository;
    @Autowired
    CommentaireMapper commentaireMapper;

    public CommentaireDTO add(CommentaireDTO a){
        return commentaireMapper.toDto( commentaireRepository.save(commentaireMapper.toEntity(a)));
    }

    public CommentaireDTO update(CommentaireDTO a){
        return commentaireMapper.toDto( commentaireRepository.save(commentaireMapper.toEntity(a)));
    }

    public List<CommentaireDTO> getall(){
        return commentaireMapper.toDto(commentaireRepository.findAll());
    }

    public CommentaireDTO getById(Long id){
        return commentaireMapper.toDto(commentaireRepository.findById(id).orElseThrow());
    }


    public void delete(Long id){
        commentaireRepository.deleteById(id);
    }
}
