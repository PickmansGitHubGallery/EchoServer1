import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        int port = 8000;
        DataInputStream in;
        DataOutputStream out;
        ServerSocket server;
        Socket socket;

        server = new ServerSocket(port);
        socket = server.accept();
        System.out.println("Venter på input");
        in = new DataInputStream( socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());

        double returTal = in.readDouble();
        out.writeDouble(returTal);
        socket.close();
    }
}