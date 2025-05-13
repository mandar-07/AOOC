import java.util.Scanner;

public class stack {
     int size;
     int[] arr=new int[size];
     int top;
   

    public stack(int size) {
	this.size=size;
        arr=new int[size];
        top = -1;
    }

    public void push() {

       while(top< size-1){ 
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
   
    public void display(){
	for(int i= top;i>=0;i--){
		System.out.print("STACK : "+ arr[i]);
	}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int size = sc.nextInt();

        stack s = new stack(size);
	int n;
       do{
         int no;
	 System.out.println("Enter the no of operation which you want to perform(1->push,2->pop,3->Display,4->top/peek,5->check is Empty,6->Check is full: ");
        no=sc.nextInt();
	switch(no){
		case 1:
			 s.push();
			break;
		case 2: 
			System.out.println("Popped element:"+s.pop());
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
			System.out.println("invalid operation");
	  }
	  System.out.println("if you want to perform another operation enter 1 ");
	   n=sc.nextInt();
	}while(n==1);
		  
    }
}
