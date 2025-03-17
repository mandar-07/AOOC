public class Queue {
    int arr[];
    int front;
    int rear;
    int capacity;
    int element;

    Queue(int size) {
        front = -1;
        rear = -1;
        capacity = size;
        arr = new int[size];
    }

    boolean isQueueFull() {
        return rear == capacity - 1;
    }

    boolean isQueueEmpty() {
        return front == -1 || front > rear;
    }

    void enqueue() {
        if (isQueueFull()) {
            System.out.println("Queue is Full.");
            return;
        }

        System.out.print("Enter Number for ENQUEUE(): ");
        element = getInput();
        if (front == -1)
            front = 0;
        arr[++rear] = element;
    }

    int dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        }

        return arr[front++];
    }

    void display() {
        if (isQueueEmpty()) {
            System.out.println("Queue is Empty.");
            return;
        }
        System.out.print("[FRONT]->");
        for (int i = front; i <= rear; i++)
            System.out.printf("[%d]->", arr[i]);
        System.out.print("[REAR]\n");
    }

    int getInput() {
        int input = 0;
        boolean valid = false;
        while (!valid) {
            try {
                byte[] buffer = new byte[10];
                System.in.read(buffer);
                String inputStr = new String(buffer).trim();
                input = Integer.parseInt(inputStr);
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println("\t\tWelcome to Queue Implementation");
        System.out.println("Please Select a number to perform operation on Queue");

        Queue queue = new Queue(10);

        while (true) {
            System.out.println("1 -> enqueue()\n2 -> dequeue()\n3 -> display()\n4 -> Exit()");
            System.out.print("Operation no: ");
            int op = queue.getInput();

            switch (op) {
                case 1:
                    queue.enqueue();
                    break;
                case 2:
                    int dequeued = queue.dequeue();
                    if (dequeued != -1) {
                        System.out.println("Dequeued Element: " + dequeued);
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid operation! Try again.");
            }
        }
    }
}
