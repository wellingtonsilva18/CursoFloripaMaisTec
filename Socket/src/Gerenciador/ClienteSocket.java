package Gerenciador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteSocket {
    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("127.0.0.1", 9999); //cria um novo Socket recebendo IP e porta

            //Lendo mensagens do servidor
            new Thread() {
                @Override
                public void run() {
                    try {
                        BufferedReader leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

                        while(true) {
                            String mensagem = leitor.readLine();
                            System.out.println("O Servidor disse: " + mensagem);
                        }

                    } catch (IOException e) {
                        System.out.println("Impossível ler a mensagem do Servidor.");
                        e.printStackTrace();
                    } // Lê o que o servidor está nos escrevendo
                }

            }.start(); //roda a Thread


            //Escrevendo para o servidor
            PrintWriter escritor = new PrintWriter(cliente.getOutputStream(), true); //cria escritor para escrever para o servidor
            //Scanner s = new Scanner(System.in);
            BufferedReader leitorTerminal = new BufferedReader(new InputStreamReader(System.in));
            String mensagemTerminal = "";
            while( true ) {
                mensagemTerminal = leitorTerminal.readLine();
                if(mensagemTerminal == null || mensagemTerminal.length() == 0) {
                    continue;
                }
                escritor.println(mensagemTerminal);
                if(mensagemTerminal.equalsIgnoreCase("FIM")) {
                    System.exit(0);
                }
            }

        } catch (UnknownHostException e) {
            System.out.println("O endereço passado é inválido!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("O Servidor pode estar fora do ar...");
            e.printStackTrace();
        }
    }
}

