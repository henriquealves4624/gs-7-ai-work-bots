package com.github.henriquealves4624.dto.bot;

import com.github.henriquealves4624.model.Bot;

public class BotResponse {

    private String membro1;
    private String membro2;
    private String descricao;
    private String tema;

    public BotResponse toDto(Bot bot) {
        this.setMembro1(membro1);
        this.setMembro2(membro2);
        this.setDescricao(descricao);;
        this.setTema(tema);
        return this;
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
