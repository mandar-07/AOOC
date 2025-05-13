import java.util.Scanner;

public class alphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];

        
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        
        bubbleSort(names);

      
        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }

    
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
               
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
        }
    }
}
