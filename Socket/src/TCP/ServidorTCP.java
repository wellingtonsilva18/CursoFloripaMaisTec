package TCP;

import java.net.*;
import java.io.*;
public class ServidorTCP {
    public static void main(String args[]) {
        ServerSocket socketServidor = null;
        try {
            socketServidor = new ServerSocket(5000);
            Socket socketCliente = null;
            socketCliente = socketServidor.accept();
            PrintWriter out = new PrintWriter(socketCliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            String entrada;
            while ((entrada = in.readLine()) != null) {
                System.out.println("O Servidor recebeu:" + entrada);
                out.println(entrada);
                if (entrada.equals("fim")) break;
            }
            out.close();
            in.close();
            socketServidor.close();
            socketCliente.close();
        }
        catch (IOException e) {
            System.out.println("Erro ao criar os streams");
            System.exit(1);
        }
    }
}
