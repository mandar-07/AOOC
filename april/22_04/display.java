import java.io.*;
	
public class display{
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("sample.txt");
			char ch;
			int a;
		do{
			a=fin.read();
			ch=(char)a;
			System.out.println(ch);
		}while(a != -1);
		}
	
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
