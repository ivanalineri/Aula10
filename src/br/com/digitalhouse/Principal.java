package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Curso cursoAndroid = new Curso("Curso de Android");
        Curso cursoFullStack = new Curso("Curso de FullStack");
        Aluno aluno1 = new Aluno("Ivanildo", 123345, "Siqueira", cursoAndroid);
        Aluno aluno2 = new Aluno("Vini", 12323453, "PHP", cursoFullStack);
        Aluno aluno3 = new Aluno("Karlon", 75493093, "termerzon", cursoAndroid);
        Aluno aluno4 = new Aluno("Joilsson", 7684273, "Sergio", cursoFullStack);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        System.out.println(alunos);

    }
}
