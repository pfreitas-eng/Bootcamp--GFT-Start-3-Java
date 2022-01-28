package com.pfreitas.bootcamp;

import java.time.LocalDate;

import com.pfreitas.bootcamp.dominio.Bootcamp;
import com.pfreitas.bootcamp.dominio.Curso;
import com.pfreitas.bootcamp.dominio.Dev;
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

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPedro = new Dev("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("Experiencia Acumulada Pedro " + devPedro.calcularTotalXp());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteudos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("Experiencia Acumulada Pedro " + devPedro.calcularTotalXp());

        Dev devThais = new Dev("Thais");
        devThais.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Thais: " + devThais.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Thais: " + devThais.getConteudosConcluidos());
        System.out.println("Experiencia Acumulada Thais " + devThais.calcularTotalXp());
        devThais.progredir();
        System.out.println("Conteudos Inscritos Thais: " + devThais.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Thais: " + devThais.getConteudosConcluidos());
        System.out.println("Experiencia Acumulada Thais " + devThais.calcularTotalXp());
         
    }
}
