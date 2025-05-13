import java.util.*;

public class inherinter {
    public static void main(String args[]) {
        result s1 = new result();
        s1.get();
        s1.getMarks();
        s1.set();
        s1.setMarks();
        s1.setsmarks();
    }
}

interface Sport {
    void setsmarks();
}

abstract class Student {
    int rollno;
    String name;
    int sub1, sub2;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll no:");
        rollno = sc.nextInt();
        sc.nextLine();
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

class test extends Student {
    Scanner sc = new Scanner(System.in);

    public test(int rollno, String name) {
        super(rollno, name);
    }

    void getMarks() {
        System.out.println("Enter Marks of sub1:");
        sub1 = sc.nextInt();
        System.out.println("Enter Marks of sub2:");
        sub2 = sc.nextInt();
    }

    void setMarks() {
        System.out.println("Marks of sub1: " + sub1);
        System.out.println("Marks of sub2: " + sub2);
    }
}

class result extends test implements Sport {
    int smarks = 20;

    public result() {
        super(0, "");
    }

    public void setsmarks() {
        int total_marks = smarks + sub1 + sub2;
        System.out.println("Result after adding sport marks: " + total_marks);
    }
}
