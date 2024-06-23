import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "descricao curso java", 8);

        Curso curso2 = new Curso("Curso Js", "descricao curso js", 4);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descricao Mentoria Java", LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Bootcamp: " + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Pedro: " + devDaniel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Pedro: " + devDaniel.getConteudosConcluidos());
        System.out.println("XP: " + devDaniel.calcularTotalXp());

        System.out.println("---------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Bootcamp: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Daniel: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Daniel: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());


    }
}
