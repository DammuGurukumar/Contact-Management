import java.net.ServerSocket;
import java.io.IOException;

public class AppServer {
    public static void main(String[] args) {
        int[] possiblePorts = { 8080, 8081, 8082, 9090 }; // List of ports to try
        ServerSocket serverSocket = null;

        for (int port : possiblePorts) {
            try {
                serverSocket = new ServerSocket(port);
                System.out.println("Server started on port " + port);
                break; // Exit the loop if successful
            } catch (IOException e) {
                System.out.println("Port " + port + " is in use. Trying the next one...");
            }
        }

        if (serverSocket == null) {
            System.out.println("No available ports found.");
            return;
        }

        // Your server logic here
    }
}
