package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String titre;
    @Column
    private String contenue;
    @Column
    private String motCles;
    @Column
    private LocalDate datpub;
    @ManyToOne(fetch =FetchType.LAZY)
    private Cathegorie cathegorie;

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

    public Cathegorie getCathegorie() {
        return cathegorie;
    }

    public void setCathegorie(Cathegorie cathegorie) {
        this.cathegorie = cathegorie;
    }
}
