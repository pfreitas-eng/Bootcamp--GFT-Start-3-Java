package com.pfreitas.bootcamp.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso extends Conteudo {
    
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format("Curso{titulo='%s', descricao='%s', cargaHoraria='%d'}", this.getTitulo(), this.getDescricao(), this.getCargaHoraria());
    }

}
