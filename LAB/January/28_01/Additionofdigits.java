import java.util.Scanner;

public class Additionofdigits{
	public static void main(String[] args){
		int number = 0;	
		int digit = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please Enter the Number: ");
		number = scanner.nextInt();
		
		while(number != 0){
			digit = number % 10;
			sum += digit;
			number /= 10;
		}

		System.out.println("The addition of digits is: " + sum);
		scanner.close();
	}
}

