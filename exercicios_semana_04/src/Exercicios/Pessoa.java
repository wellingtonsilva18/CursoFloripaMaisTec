package Exercicios;

public class Pessoa {

    private String nome;
    private int endereco;

    public Pessoa(String nome, int endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getEndereco() {
        return endereco;
    }
}

