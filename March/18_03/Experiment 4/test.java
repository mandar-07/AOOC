import java.util.*;

public class test {
    public static void main(String args[]) {
        Test s1 = new Test();
        s1.get();
        s1.getMarks();
        s1.set();
        s1.setMarks();
    }
}

abstract class Student {
    int rollno;
    String name;
    int sub1, sub2;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        this.sub1 = 0;
        this.sub2 = 0;
    }

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll no:");
        rollno = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter the name:");
        name = sc.nextLine();
    }

    void set() {
        System.out.println("Student info");
        System.out.println("Name: " + name + " Rollno: " + rollno);
    }

    abstract void getMarks();
    abstract void setMarks();
}

class Test extends Student {
    Scanner sc = new Scanner(System.in);

    public Test() {
        super(0, ""); // Default constructor
    }

    public Test(int rollno, String name) {
        super(rollno, name);
    }

    @Override
    void getMarks() {
        System.out.println("Enter Marks of sub1:");
        sub1 = sc.nextInt();
        System.out.println("Enter Marks of sub2:");
        sub2 = sc.nextInt();
    }

    @Override
    void setMarks() {
        System.out.println("Marks of sub1: " + sub1);
        System.out.println("Marks of sub2: " + sub2);
    }
}
