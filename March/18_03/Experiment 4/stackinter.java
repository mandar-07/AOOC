import java.util.Scanner;


interface StackOperations {
    void push();
    int pop();
    void top();
    void is_Empty();
    void is_Full();
    void display();
}

public class stackinter implements StackOperations {
    int size;
    int[] arr;
    int top;

    public stackinter(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    @Override
    public void push() {
        if (top == size - 1) {
            System.out.println("Stack is Overflowed");
        } else {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the element which you want to push:");
            int x = scn.nextInt();
            top++;
            arr[top] = x;
        }
    }

    @Override
    public int pop() {
        if (top >= 0) {
            return arr[top--];
        } else {
            System.out.println("Underflow occurred");
            return -1;
        }
    }

    @Override
    public void top() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }

    @Override
    public void is_Empty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is not Empty");
        }
    }

    @Override
    public void is_Full() {
        if (top == size - 1) {
            System.out.println("Stack is Full");
        } else {
            System.out.println("Stack is not Full");
        }
    }

    @Override
    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println("STACK : " + arr[i]);
        }
    }

    // Static main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int size = sc.nextInt();

        stackinter s = new stackinter(size);
        int n;
        do {
            int no;
            System.out.println("Enter the no of operation which you want to perform(1->push, 2->pop, 3->Display, 4->top/peek, 5->check is Empty, 6->Check is full): ");
            no = sc.nextInt();
            switch (no) {
                case 1:
                    s.push();
                    break;
                case 2:
                    System.out.println("Popped element: " + s.pop());
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    s.top();
                    break;
                case 5:
                    s.is_Empty();
                    break;
                case 6:
                    s.is_Full();
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            System.out.println("If you want to perform another operation enter 1 ");
            n = sc.nextInt();
        } while (n == 1);
    }
}
