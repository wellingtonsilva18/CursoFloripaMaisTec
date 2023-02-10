package exercicios01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//ex02 acessorios

        Acessorios acessoriosA = new Acessorios();
        acessoriosA.hardware = "mouse";
        acessoriosA.marca = "positivo";
        acessoriosA.valor = "10";

        System.out.println(acessoriosA.hardware);
        System.out.println(acessoriosA.marca);
        System.out.println(acessoriosA.valor);
    }
}


