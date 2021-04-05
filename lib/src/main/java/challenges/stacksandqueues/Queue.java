package stacksandqueues;

import java.lang.reflect.Array;
import java.util.EmptyStackException;

public class Queue {
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    void pushToQueue(int value) {
        Node temp = new Node(value);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    public int popOutOfQueue() {
       if (this.front == null)
           return 0;

       Node temp = this.front;
       this.front = this.front.next;

       if (this.front == null)
           this.rear = null;
        System.out.println("this is temp.value =>" + temp.value);

        return temp.value;
    }


}
