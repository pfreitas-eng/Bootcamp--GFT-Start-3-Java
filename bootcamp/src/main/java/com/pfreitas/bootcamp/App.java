package com.pfreitas.bootcamp;

import java.time.LocalDate;

import com.pfreitas.bootcamp.dominio.Curso;
import com.pfreitas.bootcamp.dominio.Mentoria;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);
    
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
