import java.util.Scanner;

public class Primeno{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = 0;

		System.out.print("Please Enter the number: ");
		number = scanner.nextInt();

		while(number <= number){
			if(number%2==0&&number>2){
				System.out.println("No is not prime");
				break;
			}else{
				System.out.println("No is prime");
				break;
			}
		}
	}
}

