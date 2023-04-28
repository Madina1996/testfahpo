package com.example.demo.service.DTO;

import java.time.LocalDate;

public class ArticleDTO {
    private Long id;

    private String titre;

    private String contenue;
    private String motCles;
    private LocalDate datpub;
    private Long cathegorie;
    private String cathegoriename;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenue() {
        return contenue;
    }

    public void setContenue(String contenue) {
        this.contenue = contenue;
    }

    public String getMotCles() {
        return motCles;
    }

    public void setMotCles(String motCles) {
        this.motCles = motCles;
    }

    public LocalDate getDatpub() {
        return datpub;
    }

    public void setDatpub(LocalDate datpub) {
        this.datpub = datpub;
    }

    public Long getCathegorie() {
        return cathegorie;
    }

    public void setCathegorie(Long cathegorie) {
        this.cathegorie = cathegorie;
    }

    public String getCathegoriename() {
        return cathegoriename;
    }

    public void setCathegoriename(String cathegoriename) {
        this.cathegoriename = cathegoriename;
    }
}
