import java.util.*;

interface student
{
	public void getMarks();
	public void setMarks();
}
class stud implements student{
	int rollno;
	int marks;

	public stud(int rollno){
		this.rollno=rollno;
	}

	 public  void setMarks(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		 marks=sc.nextInt();
	}

	public void getMarks(){
		System.out.println("Marks for student having roll no "+rollno +"is :"+marks);
	}
}
public class Student{
	public static void main(String args[]){
		stud s1=new stud(67);
		s1.setMarks();
		s1.getMarks();
	}
}
