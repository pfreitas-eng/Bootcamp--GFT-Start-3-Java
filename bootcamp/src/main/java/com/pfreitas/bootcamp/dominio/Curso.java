package com.pfreitas.bootcamp.dominio;

import lombok.Data;
import lombok.ToString;

@Data
@ToString()
public class Curso {
    
    private String titulo;
    private String descricao;
    private int cargaHoraria;

}
