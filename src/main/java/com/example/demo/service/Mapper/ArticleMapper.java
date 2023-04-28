package com.example.demo.service.Mapper;

import com.example.demo.domain.Article;
import com.example.demo.domain.Cathegorie;
import com.example.demo.service.DTO.ArticleDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@Service
public class ArticleMapper  implements EntityMapper<ArticleDTO, Article> {
    @Override
    public Article toEntity(ArticleDTO dto) {
        Article a = new Article();
        Cathegorie c  = new Cathegorie();
        c.setId(dto.getCathegorie());
        a.setCathegorie(c);
        a.setContenue(dto.getContenue());
        a.setDatpub(dto.getDatpub());
        a.setId(dto.getId());
        a.setMotCles(dto.getMotCles());
        a.setTitre(dto.getTitre());
        return a;
    }

    @Override
    public ArticleDTO toDto(Article a) {
        ArticleDTO dto = new ArticleDTO();

        dto.setCathegoriename(a.getCathegorie().getLibelle());
        dto.setCathegorie(a.getCathegorie().getId());

        dto.setContenue(a.getContenue());
        dto.setDatpub(a.getDatpub());
        dto.setId(a.getId());
        dto.setMotCles(a.getMotCles());
        dto.setTitre(a.getTitre());
        return dto;
    }

    @Override
    public List<Article> toEntity(List<ArticleDTO> dtoList) {
        return dtoList.stream()
                .filter(Objects::nonNull)
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<ArticleDTO> toDto(List<Article> entityList) {
        return entityList.stream()
                .filter(Objects::nonNull)
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
