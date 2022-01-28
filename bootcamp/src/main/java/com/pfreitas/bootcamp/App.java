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
        Curso curso1 = new Curso("curso java", "descricao curso java", 8);
        Curso curso2 = new Curso("curso js", "descricao curso js", 4);
        Mentoria mentoria1 = new Mentoria("mentoria de java", "descricao mentoria java", LocalDate.now());
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
