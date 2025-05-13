import java.io.*;
import java.net.*;
import java.util.Scanner;

public class FactorialClient {
    public static void main(String[] args) {
        final String SERVER_ADDRESS = "localhost";
        final int PORT = 12345;
        
        try (Socket socket = new Socket(SERVER_ADDRESS, PORT);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(
                 new InputStreamReader(socket.getInputStream()));
             Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Connected to Factorial Server");
            System.out.println("Enter numbers to calculate factorial (or 'quit' to exit)");
            
            while (true) {
                System.out.print("Enter a number: ");
                String input = scanner.nextLine();
                
                if (input.equalsIgnoreCase("quit")) {
                    break;
                }
                
                out.println(input);
                String response = in.readLine();
                System.out.println("Server response: " + response);
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + SERVER_ADDRESS);
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}