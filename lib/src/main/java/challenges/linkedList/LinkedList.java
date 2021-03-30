package challenges.linkedList;
import java.util.*;


public class LinkedList {
    public Node head = null;
    public Node tail = null;

    public void insert(String data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;

        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean includes(String x) {
        Node current = this.head;
        while (current != null) {
            if (current.data.equals(x))
                return true;
            current = current.next;
        }
        return false;
    }

    public void append(String data) {
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.next == null) {
                Node newNode = new Node(data);
                newNode.next = null;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void insertBefore(String data, String newData){
        Node newNode = new Node(newData);
        Node current = this.head;
        boolean isHeadOrTail = this.tail.data.equals(data) || current.data.equals(data);
        if(!isHeadOrTail){
            while(current.next != null){
                if(current.next.data.equals(data)){
                    newNode.next = current.next;
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }
        }
        else{
            if(this.tail.value.equals(data)) {
                newNode.next = this.tail;
                this.tail.prev.next = newNode;
            }
            else {
                this.insert(newData);
            }
        }
    }
}




