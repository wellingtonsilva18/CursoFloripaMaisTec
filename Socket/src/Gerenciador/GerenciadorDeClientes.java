package Gerenciador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GerenciadorDeClientes extends Thread{

    private Socket cliente;
    private String nomeCliente;

    public GerenciadorDeClientes(Socket cliente) {
        this.cliente = cliente;
        start();
    }
    /**
     *
     */
    @Override
    public void run() {
        try {
            BufferedReader leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream())); //pega mensagens do cliente
            PrintWriter escritor = new PrintWriter(cliente.getOutputStream(), true); //manda pro cliente
            escritor.println("Por favor, escreva seu nome:"); //solicita a inserção do nome
            String msg = leitor.readLine(); //Capta essa inserção
            this.nomeCliente = msg; // Recebe o nome do cliente
            escritor.println("Olá " + this.nomeCliente); //Confirma a inserção do nome dando Olá


            while(true) {
                msg = leitor.readLine();
                if(msg.equalsIgnoreCase("FIM")) {
                    this.cliente.close();
                }else {
                    escritor.println(this.nomeCliente + ", você disse: " + msg); // mostra na tela a mensagem que o cliente digitou
                }
            }

        } catch (IOException e) {
            System.err.println("O cliente fechou a conexão.");
            e.printStackTrace();
        }

    }
}
