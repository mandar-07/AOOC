import java.util.*;

public class factorial{
	public static void main(String[] args){
		int n = 0;
		long factorial = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter N for factorial: ");
		n = scanner.nextInt();

		if(n < 0){
			System.out.println("Factorial of Negative number cannot be Possible" );
			return;
		}

		for(int i = 1; i <= n; i++)
			factorial *= i;

		System.out.println("Factorial of " + n + " is: " + factorial);
	}
}
