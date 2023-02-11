import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
class UDPClient {
    public static void main(String args[]) throws Exception {
        while (true) {
            DatagramSocket clientSocket = new DatagramSocket();
            byte[] sendData = new byte[1024];
            byte[] receiveData = new byte[1024];
            InetAddress IPAddress = InetAddress.getByName("localhost");
            String sentence = JOptionPane.showInputDialog("Digite:");
            sendData = sentence.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sentence.length(), IPAddress, 9876);
            clientSocket.send(sendPacket);
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String received = new String(receivePacket.getData());
            System.out.println("Recebido do servidor:" + received);
            clientSocket.close();
            if (sentence.equals("fim"))
                break;
        }
    }
}
