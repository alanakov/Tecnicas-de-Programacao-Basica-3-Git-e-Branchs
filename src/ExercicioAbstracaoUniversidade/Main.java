package ExercicioAbstracaoUniversidade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da universidade 1: ");
        String nomeUniversidade1 = scanner.nextLine();

        System.out.print("Digite o nome da universidade 2: ");
        String nomeUniversidade2 = scanner.nextLine();

        Universidade universidade1 = new Universidade(nomeUniversidade1);
        Universidade universidade2 = new Universidade(nomeUniversidade2);


        Pessoa einstein = new Pessoa( universidade1, "14/03/1879", "Albert Einstein");
        Pessoa newton = new Pessoa( universidade2, "04/01/1643", "Isaac Newton");


        System.out.println(einstein.informacoesPessoa());
        System.out.println(newton.informacoesPessoa());
    }
}
