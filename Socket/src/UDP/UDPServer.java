package UDP;

import java.net.*;
class UDPServer {
    public static void main(String args[]) throws Exception {
        System.out.println("Servidor Iniciado...");
        while (true) {
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];
            DatagramSocket serverSocket = new DatagramSocket(9876);
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            String sentence = new String(receivePacket.getData());
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            System.out.println("Recebido de " + IPAddress.getHostAddress()+":" + sentence);
            sendData = sentence.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
            serverSocket.close();
        }
    }
}