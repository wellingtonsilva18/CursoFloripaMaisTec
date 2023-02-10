
package EXERCICIOS;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a = 1;
        int b = 0;
        int x;

        System.out.println("Digite quantos numeros da sequencia Fibonacci deseja verificar :");
        int y = ler.nextInt();

        for (int i = 0; i < y; i++){
            System.out.println(a);
            x = a;
            a = a + b;
            b = x;
        }
    }
}
