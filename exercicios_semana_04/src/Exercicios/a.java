package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class a {


    public static void main(String[] args) {
        try {
        List<Pessoa> pessoaList = new ArrayList<>();

        PessoaFisica p1 = new PessoaFisica("wellington", 33, "12345678901");
        PessoaJuridica p2 = new PessoaJuridica("wellington", 33, "1234567890123456");

        pessoaList.add(p1);
        pessoaList.add(p2);

        printPessoaList(pessoaList);
        } catch (Exception e) {
            System.err.println("Ocorreu uma exceção ao criar a lista de pessoas " + e.getMessage());
        }
    }

    private static void printPessoaList(List<Pessoa> pessoaList) {
        for (Pessoa pessoa : pessoaList) {
            System.out.println("Name: " + pessoa.getNome());
            System.out.println("Age: " + pessoa.getEndereco());

            if (pessoa instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) pessoa;
                System.out.println("CPF: " + pf.getCpf());
            } else if (pessoa instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) pessoa;
                System.out.println("CNPJ: " + pj.getCnpj());
            }

            System.out.println();
        }
    }
}
