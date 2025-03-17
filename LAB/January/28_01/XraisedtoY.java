import java.util.*;

public class XraisedtoY{
	public static void main(String[] args){
		int X = 0;
		int Y = 0;
		int Result = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter The number X: ");
		X = scanner.nextInt();

		System.out.print("Enter The Y (Raised to) : ");
		Y = scanner.nextInt();
		
		if(Y < 0){
			System.out.println("Enter the positive number for Y");
			return;
		}

		for(int i = 1; i <= Y; i++)
			Result *= X;

		System.out.println("Ans is : "+ Result);
		scanner.close();
	}
}
