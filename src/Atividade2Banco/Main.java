package Atividade2Banco;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(12345, "Alana", 1000);

        conta1.exibirSaldo();

        conta1.depositar(100);
        conta1.exibirSaldo();

        conta1.sacar(2000);

        conta1.sacar(700);
        conta1.exibirSaldo();
    }

}
