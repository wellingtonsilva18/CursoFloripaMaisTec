package Gerenciador;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket {

    public static void main(String[] args) {
        ServerSocket servidor = null;
        try {
            System.out.println("Startando o Server...");
            servidor = new ServerSocket(9999); //Starta o server
            System.out.println("Servidor Startado!");

            while(true) {
                Socket cliente = servidor.accept(); //fica aguardando um novo cliente
                Thread GerenciadorDeClientes = new GerenciadorDeClientes(cliente); //cria um novo cliente
            }

        } catch (IOException e) {
            try {
                if (servidor != null)
                    servidor.close();
            } catch (IOException e1) {}
            System.err.println("A porta está ocupada ou o servidor foi fechado");
            e.printStackTrace();
        }

    }

}
