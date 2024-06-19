import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Js");
        curso1.setDescricao("descricao curso js");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Daniel");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Daniel: " + dev.getConteudosIncritos());
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos Daniel: " + dev.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Daniel: " + dev.getConteudosConculidos());
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("---------------");

        Dev dev1 = new Dev();
        dev1.setNome("Pedro");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Pedro: " + dev1.getConteudosIncritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos Pedro: " + dev1.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Pedro: " + dev1.getConteudosConculidos());
        System.out.println("XP: " + dev1.calcularTotalXp());



    }
}
