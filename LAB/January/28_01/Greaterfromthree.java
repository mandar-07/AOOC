import java.util.*;

public class Greaterfromthree{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a,b,c;

		System.out.print("Please enter The First number: ");
		a = scanner.nextInt();

		System.out.print("Please enter The Second number: ");
		b = scanner.nextInt();

		System.out.print("Please enter The Third number: ");
		c = scanner.nextInt();
		
		if(a > b && a > c)
			System.out.printf("%d is greater.\n", a);
		else if(b > a && b > c)
			System.out.printf("%d is greater.\n", b);
		else
			System.out.printf("%d is greater.\n",c);

		scanner.close();
	}
}
