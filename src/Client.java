import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        int port = 8000;
        String host = "localhost";
        DataInputStream in;
        DataOutputStream out;
        Socket socket;


        Scanner input = new Scanner(System.in);
        System.out.println("Skriv et tal");
        double brugerInput = input.nextDouble();


        socket = new Socket(host,port);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        out.writeDouble(brugerInput);
        System.out.println(in.readDouble());
        socket.close();
    }
}
