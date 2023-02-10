package exercicios04;

import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner ler=new Scanner(System.in);

            //ex04
            System.out.println("Digite seu salario : ");
            float valorSalario = ler.nextInt();

            Ir ir = new Ir(valorSalario);

            System.out.println("valor deduzido imposto de renda sobre salario : R$ " +ir.getSalario());

            System.out.println("Digite seu salario : ");
            float valorSalario1 = ler.nextInt();

            ir.setSalario(valorSalario1);
            System.out.println("valor deduzido imposto de renda sobre salario : R$ " +ir.getSalario());

        }
    }

