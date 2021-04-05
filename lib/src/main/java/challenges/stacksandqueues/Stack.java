package stacksandqueues;

import java.lang.reflect.Array;

public class Stack {
    public static void main(String[] args) {

            Queue addNode = new Queue();
            addNode.pushToQueue(1);
            addNode.pushToQueue(2);
            addNode.pushToQueue(3);
            addNode.pushToQueue(4);
            addNode.pushToQueue(5);
            addNode.popOutOfQueue();
            addNode.popOutOfQueue();
            addNode.popOutOfQueue();


        System.out.println("Queue Front : "+addNode.front.value);
        System.out.println("Queue Rear : "+addNode.rear.value);


        }
    }





