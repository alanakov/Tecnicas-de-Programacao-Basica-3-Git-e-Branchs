package Atividade2Banco;

public class ContaBancaria {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void depositar (double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        }
    }

    public void sacar (double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso");
        }
    }

    public void exibirSaldo() {
        System.out.println("O saldo da conta é de: R$" + saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


