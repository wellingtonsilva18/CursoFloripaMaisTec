package EXERCICIOS;
import java.util.Scanner;
public class EX04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nomeCliente;

        System.out.println("Digite nome cliente :");
        nomeCliente = ler.nextLine();

        int opc;

        System.out.println("Escolha o produto :");
        System.out.print("\n[1] Relógio de pulso\n[2] Pulseiras de prata\n");
        opc = ler.nextInt();

        switch (opc){
            case 1 :
                System.out.println("\nRelogio de pulso\n");

                int relogio;
                int valorRelogio;

                System.out.println("Digite a quantidade de relogios :");
                relogio = ler.nextInt();

                System.out.println("Digite o valor unitario do produto :");
                valorRelogio = ler.nextInt();

                int totalValorRelogio = relogio*valorRelogio;
                System.out.println("Valor total da compra : R$ "+totalValorRelogio);

                int opcDesc;

                System.out.print("Escolha a Opcao de desconto : ");
                System.out.print("\n[1] 10% \n[2] 15% \n[3] 20%\n");
                opcDesc = ler.nextInt();


                switch (opcDesc){
                    case 1:
                        double desconto10 = 0.1;
                        double totalValorRelDesconto10 = totalValorRelogio-totalValorRelogio*desconto10;
                        System.out.println("Cliente : "+nomeCliente);
                        System.out.println("Valor total da compra : R$ "+totalValorRelogio);
                        System.out.println("Desconto : 10%");
                        System.out.println("Valor total da compra com desconto: R$ "+totalValorRelDesconto10);
                        break;

                    case 2:
                        double desconto15 = 0.15;
                        double totalValorRelDesconto15 = totalValorRelogio-totalValorRelogio*desconto15;
                        System.out.println("Cliente : "+nomeCliente);
                        System.out.println("Valor total da compra : R$ "+totalValorRelogio);
                        System.out.println("Desconto : 15%");
                        System.out.println("Valor total da compra com desconto: R$ "+totalValorRelDesconto15);
                        break;

                    case 3:
                        double desconto20 = 0.20;
                        double totalValorRelDesconto20 = totalValorRelogio-totalValorRelogio*desconto20;
                        System.out.println("Cliente : "+nomeCliente);
                        System.out.println("Valor total da compra : R$ "+totalValorRelogio);
                        System.out.println("Desconto : 20%");
                        System.out.println("Valor total da compra com desconto: R$ "+totalValorRelDesconto20);
                        break;

                }
                break;
            case 2 :
                System.out.println("\nPulseira de prata\n");

                int pulseira;
                int valorpulseira;

                System.out.println("Digite a quantidade de pulseira :");
                pulseira = ler.nextInt();

                System.out.println("Digite o valor unitario do produto : ");
                valorpulseira = ler.nextInt();

                int totalValorpulseira = pulseira*valorpulseira;
                System.out.println("Valor total da compra : R$ "+totalValorpulseira);

                int opcDesc2;

                System.out.print("Escolha a Opcao de desconto : ");
                System.out.print("\n[1] 10% \n[2] 15% \n[3] 20%\n");
                opcDesc2 = ler.nextInt();


                switch (opcDesc2){
                    case 1:
                        double desconto10 = 0.1;
                        double totalValorPulDesconto10 = totalValorpulseira-totalValorpulseira*desconto10;
                        System.out.println("Cliente : "+nomeCliente);
                        System.out.println("Valor total da compra : R$ "+totalValorpulseira);
                        System.out.println("Desconto : 10%");
                        System.out.println("Valor total da compra com desconto: R$ "+totalValorPulDesconto10);
                        break;

                    case 2:
                        double desconto15 = 0.15;
                        double totalValorPulDesconto15 = totalValorpulseira-totalValorpulseira*desconto15;
                        System.out.println("Cliente : "+nomeCliente);
                        System.out.println("Valor total da compra : R$ "+totalValorpulseira);
                        System.out.println("Desconto : 15%");
                        System.out.println("Valor total da compra com desconto: R$ "+totalValorPulDesconto15);
                        break;

                    case 3:
                        double desconto20 = 0.20;
                        double totalValorPulDesconto20 = totalValorpulseira-totalValorpulseira*desconto20;
                        System.out.println("Cliente : "+nomeCliente);
                        System.out.println("Valor total da compra : R$ "+totalValorpulseira);
                        System.out.println("Desconto : 20%");
                        System.out.println("Valor total da compra com desconto: R$ "+totalValorPulDesconto20);
                        break;

                }
                break;
        }
    }
}
