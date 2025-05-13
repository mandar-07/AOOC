import java.util.Scanner;

public class Stack {
    private int[] arr;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack is Overflowed");
        } else {
            arr[++top] = x;
            System.out.println("Element " + x + " pushed to stack.");
        }
    }

    public int pop() {
        if (top >= 0) {
            return arr[top--];
        } else {
            System.out.println("Underflow occurred");
            return -1;
        }
    }

    public void top() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }

    public void is_Empty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is not Empty");
        }
    }

    public void is_Full() {
        if (top == size - 1) {
            System.out.println("Stack is Full");
        } else {
            System.out.println("Stack is not Full");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Check if Stack is Full");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    stack.top();
                    break;
                case 4:
                    stack.is_Empty();
                    break;
                case 5:
                    stack.is_Full();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
