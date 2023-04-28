package com.example.demo.service.DTO;

import java.util.Date;

public class CommentaireDTO {
    private Long id;
    private Long utilisateur;
    private String utilisateurName;

    private Long article;
    private String articleName;
    private String commantaire;

    private Date datcom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Long utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getUtilisateurName() {
        return utilisateurName;
    }

    public void setUtilisateurName(String utilisateurName) {
        this.utilisateurName = utilisateurName;
    }

    public Long getArticle() {
        return article;
    }

    public void setArticle(Long article) {
        this.article = article;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getCommantaire() {
        return commantaire;
    }

    public void setCommantaire(String commantaire) {
        this.commantaire = commantaire;
    }

    public Date getDatcom() {
        return datcom;
    }

    public void setDatcom(Date datcom) {
        this.datcom = datcom;
    }
}
