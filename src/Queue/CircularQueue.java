package Queue;

public class CircularQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queue;

    public CircularQueue(int size) {
        maxSize = size + 1; 
        queue = new int[maxSize];
        front = 0;
        rear = 0;
    }
    public boolean isEmpty() {
        return front == rear;
    }
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }
    public void enqueue(int data) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            queue[rear] = data;
            System.out.println("Enqueued: " + data);
        } else {
            System.out.println("Queue is full. Cannot enqueue " + data);
        }
    }
    public int dequeue() {
        if (!isEmpty()) {
            front = (front + 1) % maxSize;
            int data = queue[front];
            System.out.println("Dequeued: " + data);
            return data;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
    }
    public void display() {
        int current = (front + 1) % maxSize;
        System.out.print("Queue: ");
        while (current != (rear + 1) % maxSize) {
            System.out.print(queue[current] + " ");
            current = (current + 1) % maxSize;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.display();
    }
}
