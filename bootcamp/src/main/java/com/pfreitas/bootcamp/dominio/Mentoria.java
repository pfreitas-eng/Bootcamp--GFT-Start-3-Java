package com.pfreitas.bootcamp.dominio;

import java.time.LocalDate;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Mentoria {
    
    private String titulo;
    private String descricao;
    private LocalDate data;

}
