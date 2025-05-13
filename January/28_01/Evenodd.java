import java.util.Scanner;

public class Evenodd{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = 0;

		System.out.print("Please Enter the Number: ");
		number = scanner.nextInt();

		if(number % 2 == 0)
			System.out.println("The Entered number is EVEN");
		else
			System.out.println("The Entered number is ODD");

		scanner.close();
	}
}
