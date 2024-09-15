package Atividade1Academia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do aluno: ");
        Integer idade = sc.nextInt();

        System.out.println("Digite o peso do aluno (em kg): ");
        double peso = sc.nextDouble();

        System.out.println("Digite a altura do aluno (em cm): ");
        double altura = sc.nextDouble();

        Aluno aluno1 = new Aluno(nome, idade, peso, altura);
        aluno1.informacoes();
    }
}
