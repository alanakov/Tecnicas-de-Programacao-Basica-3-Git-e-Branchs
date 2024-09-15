package Atividade1Academia;

public class Aluno {
    private String nome;
    private Integer idade;
    private double peso;
    private double altura;

    public Aluno(String nome, Integer idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double imc() {
        return peso / (altura * altura);
    }

    public String menorDeIdade() {
        if (idade < 18) {
            System.out.println("Possui desconto");
        } else {
            System.out.println("Não possui desconto");
        }
        return "";
    }

    public void informacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + imc());
        System.out.println(menorDeIdade());
    }
}
