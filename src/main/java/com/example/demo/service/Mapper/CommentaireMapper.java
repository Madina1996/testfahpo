package com.example.demo.service.Mapper;

import com.example.demo.domain.Article;
import com.example.demo.domain.Commentaire;
import com.example.demo.domain.Utilisateur;
import com.example.demo.service.DTO.CommentaireDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CommentaireMapper  implements EntityMapper<CommentaireDTO, Commentaire> {
    @Override
    public Commentaire toEntity(CommentaireDTO dto) {
        Commentaire c = new Commentaire();
        Utilisateur u = new Utilisateur();
        Article a = new Article();

        u.setId(dto.getUtilisateur());
        a.setId(dto.getArticle());

        c.setArticle(a);
        c.setUtilisateur(u);
        c.setDatcom(dto.getDatcom());
        c.setCommantaire(dto.getCommantaire());
        return c;

    }

    @Override
    public CommentaireDTO toDto(Commentaire c) {
        CommentaireDTO dto = new CommentaireDTO();
        dto.setArticleName(c.getArticle().getContenue());
        dto.setArticle(c.getArticle().getId());
        dto.setUtilisateurName(c.getUtilisateur().getPrenom()+" "+c.getUtilisateur().getNom() );
        dto.setUtilisateur(c.getUtilisateur().getId());
        dto.setCommantaire(c.getCommantaire());
        dto.setDatcom(c.getDatcom());
        return dto;
    }

    @Override
    public List<Commentaire> toEntity(List<CommentaireDTO> dtoList) {
        return dtoList.stream()
                .filter(Objects::nonNull)
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<CommentaireDTO> toDto(List<Commentaire> entityList) {
        return entityList.stream()
                .filter(Objects::nonNull)
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
