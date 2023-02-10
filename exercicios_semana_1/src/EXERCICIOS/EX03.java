package EXERCICIOS;
import java.util.Scanner;
public class EX03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int relogio, valorRelogio, pulseira, valorPulseira;

        System.out.println("Digite a quantidade de relogios :");
        relogio = ler.nextInt();

        System.out.println("Digite o valor unitario do relogio :");
        valorRelogio = ler.nextInt();

        System.out.println("Digite a quantidade de pulseiras :");
        pulseira = ler.nextInt();

        System.out.println("Digite o valor unitario da pulseira :");
        valorPulseira = ler.nextInt();


        int totalRelogio = relogio*valorRelogio;
        int totalpulseira = pulseira*valorPulseira;

        int totalCompra = totalRelogio+totalpulseira;

        if(totalCompra >= 2000){

            double totalDesconto;
            double desconto = 0.20;
            double totalCompraDesconto ;

            totalDesconto = totalCompra*desconto;
            totalCompraDesconto = totalCompra-totalDesconto;
            System.out.println("valor compra : " +totalCompraDesconto+ "." );
            System.out.println("valor desconto : " +totalDesconto+ "." );
        }

        if(totalCompra >= 3000){

            double totalDesconto;
            double desconto = 0.25;
            double totalCompraDesconto ;

            totalDesconto = totalCompra*desconto;
            totalCompraDesconto = totalCompra-totalDesconto;
            System.out.println("valor compra : " +totalCompraDesconto+ "." );
            System.out.println("valor desconto : " +totalDesconto+ "." );
        }
        else{
            System.out.println("Esse valor nao gera desconto!!!");
        };
    }
}

