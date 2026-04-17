import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Curso sobre Java", 9);
        Curso curso2 = new Curso("Curso de QA", "Curso sobre Qualidade de Código", 4);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria sobre Java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso1.calcularXp());

        System.out.println(mentoria1);
        System.out.println(mentoria1.calcularXp());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Dev Gustavo");

        System.out.println("Conteudos inscritos: " + devGustavo.getConteudosInscritos());

        devGustavo.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos: " + devGustavo.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXp());
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("Conteudos inscritos: " + devGustavo.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXp());
    }
}