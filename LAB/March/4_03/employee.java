import java.util.*;

public class employee {
    public static void main(String args[]) {
        System.out.println("Employee 1 details");
        Employee em1 = new Employee("Mandar", "patil", 100000);
        em1.get();
        em1.set();
        
        int yearlyBefore1 = em1.salary * 12;
        System.out.println("Yearly Salary: " + yearlyBefore1);
        
        em1.salary = (int)(em1.salary * 1.10);
        System.out.println("After 10% raise:");
        em1.set();
        int yearlyAfter1 = em1.salary * 12;
        System.out.println("Yearly Salary: " + yearlyAfter1);
        
        System.out.println("---------------------------------------");
        System.out.println("Employee 2 details");
        Employee em2 = new Employee("harsh", "Chandankhede", 100000);
        em2.get();
        em2.set();
        
        int yearlyBefore2 = em2.salary * 12;
        System.out.println("Yearly Salary: " + yearlyBefore2);
        
        em2.salary = (int)(em2.salary * 1.10);
        System.out.println("After 10% raise:");
        em2.set();
        int yearlyAfter2 = em2.salary * 12;
        System.out.println("Yearly Salary: " + yearlyAfter2);
    }
}

class Employee {
    String first_name;
    String last_name;
    int salary;

    public Employee(String f, String l, int s) {
        first_name = f;
        last_name = l;
        salary = s;
    }

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        first_name = sc.nextLine();
        System.out.println("Enter Last Name");
        last_name = sc.nextLine();
        System.out.println("Enter Salary");
        salary = sc.nextInt();
        if (salary < 0) {
            salary = 0;
        }
    }

    void set() {
        System.out.println("First name is: " + first_name);
        System.out.println("Last name is: " + last_name);
        System.out.println("Monthly Salary is: " + salary);
    }
}