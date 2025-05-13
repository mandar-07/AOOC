import java.util.Scanner;

public class Addition{
	public static void main(String[] args){
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please Enter the first Number: ");
		a = scanner.nextInt();

		System.out.print("Please Enter the Second Number: ");
		b = scanner.nextInt();

		c = a + b;

		System.out.println("The additio of Two numbers is: " + c);
		scanner.close();
	}
}
