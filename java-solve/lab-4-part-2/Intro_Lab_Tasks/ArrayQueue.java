package Intro_Lab_Tasks;

public class ArrayQueue {

    private Object[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int arrayLen) {
        this.queue = new Object[arrayLen];
        this.front = 0;
        this.rear = 0;
	    this.size = 0;
    }

    public void enqueue(Object element) {
        if (size == queue.length) {
            System.out.println("queue is full!!");
            return;
        }

        queue[rear] = element;
        rear = (rear + 1) % queue.length;
        size++;
        System.out.println("Enqueued: " + element);
    }

    public Object dequeue() {
        if (size == 0) {
            return "Queue is empty!";
        }
        
        Object item = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return item;

    }

    public Object peek() {
        if (size == 0) {
            return "Queue is empty!";
        }

        return queue[front];
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false; 
    }
}
