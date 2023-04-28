package com.example.demo.service;

import com.example.demo.domain.Article;
import com.example.demo.repository.ArticleRepository;
import com.example.demo.service.DTO.ArticleDTO;
import com.example.demo.service.Mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    ArticleMapper articleMapper;

    public ArticleDTO add(ArticleDTO a){
        return articleMapper.toDto( articleRepository.save(articleMapper.toEntity(a)));
    }

    public ArticleDTO update(ArticleDTO a){
        return articleMapper.toDto( articleRepository.save(articleMapper.toEntity(a)));
    }

    public List<ArticleDTO> getall(){
        return articleMapper.toDto(articleRepository.findAll());
    }

    public ArticleDTO getById(Long id){
        return articleMapper.toDto(articleRepository.findById(id).orElseThrow());
    }


    public void delete(Long id){
        articleRepository.deleteById(id);
    }

}
