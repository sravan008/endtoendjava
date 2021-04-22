package ksk.ds.queue;

public class Queue {

    private int front;
    private int rear;
    private int size;
    private int[] queueArray;

    public Queue(int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        queueArray = new int[size];
    }

    boolean isFull() {
        return (rear == size - 1);
    }

    boolean isEmpty() {
        return (front == rear);
    }

    void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is FULL");
            return;
        } else if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            queueArray[rear] = data;
        } else {
            rear++;
            queueArray[rear] = data;
        }
    }


    void dQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else if (front == rear) {
            front = rear = -1;
        } else front++;

    }

    void printQueue() {
        System.out.println("QUEUE");
        for (int i = front; i < rear+1; i++) {
            System.out.println(queueArray[i]);
        }
    }


    public static void main(String[] args) {

        Queue queue = new Queue(7);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.printQueue();
        queue.enQueue(6);
        queue.printQueue();
        queue.dQueue();
        queue.printQueue();
        queue.dQueue();
        queue.dQueue();
        queue.printQueue();
    }

}
