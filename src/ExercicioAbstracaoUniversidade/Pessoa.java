package ExercicioAbstracaoUniversidade;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Universidade universidade;

    public Pessoa(Universidade universidade, String dataNascimento, String nome) {
        this.universidade = universidade;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public String informacoesPessoa() {
        return nome + " (nascido em " + dataNascimento + ") trabalhou na Universidade " + universidade.getNome();
    }
}
