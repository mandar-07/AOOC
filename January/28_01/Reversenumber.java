import java.util.Scanner;

public class Reversenumber{
	public static void main(String[] args){
		int original = 0;
		int reversed = 0;
		int digit = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter the number: ");
		original = scanner.nextInt();
		
		while(original !=  0){
			digit  = original % 10;
			reversed = reversed * 10 + digit;
			original /= 10;
		}
		System.out.println("Reversed number is : " + reversed);
		scanner.close();
	}
}
