package com.github.henriquealves4624.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String membro1;
    private String membro2;
    private String descricao;
    private String tema;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMembro1() {
        return membro1;
    }
    public void setMembro1(String membro1) {
        this.membro1 = membro1;
    }
    public String getMembro2() {
        return membro2;
    }
    public void setMembro2(String membro2) {
        this.membro2 = membro2;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }

}
