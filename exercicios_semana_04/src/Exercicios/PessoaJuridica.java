package Exercicios;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, int endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

}
