package Exercicios;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nome, int endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

}
