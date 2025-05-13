import java.io.*;
import java.net.*;
import java.math.BigInteger;

public class FactorialServer {
    public static void main(String[] args) {
        final int PORT = 12345;
        
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Factorial Server is running on port " + PORT);
            
            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(
                         new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(
                         clientSocket.getOutputStream(), true)) {
                    
                    System.out.println("Client connected: " + 
                                      clientSocket.getInetAddress());
                    
                    String input;
                    while ((input = in.readLine()) != null) {
                        try {
                            int number = Integer.parseInt(input);
                            if (number < 0) {
                                out.println("Error: Factorial is not defined for negative numbers");
                            } else {
                                BigInteger factorial = calculateFactorial(number);
                                out.println(factorial.toString());
                            }
                        } catch (NumberFormatException e) {
                            out.println("Error: Please enter a valid integer");
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Error handling client connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Could not start server on port " + PORT);
            e.printStackTrace();
        }
    }
    
    private static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}