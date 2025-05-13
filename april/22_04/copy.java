import java.io.*;

public class copy {
    public static void main(String[] args) {
        String inputFile = "source.txt";
        String outputFile = "destination.txt";
        
        try (
            FileInputStream fin = new FileInputStream(inputFile);
            FileOutputStream fout = new FileOutputStream(outputFile)
        ) {
            int a;
            
            while ((a = fin.read()) != -1) {
                fout.write(a);
            }
            
            System.out.println("File copied successfully!");
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
