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

    public void insertBefore(String data, String newData) {
        Node newNode = new Node(newData);
        Node current = this.head;
        System.out.println(current);
        boolean isHeadOrTail = this.tail.data.equals(data) || current.data.equals(data);
        if (!isHeadOrTail) {
            while (current.next != null) {
                if (current.next.data.equals(data)) {
                    newNode.next = current.next;
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }
        } else {
            if (this.tail.value.equals(data)) {
                newNode.next = this.tail;
                this.tail.prev.next = newNode;
            } else {
                this.insert(newData);
            }
        }
    }

    public void insertAfter(String data, String newData) {
        Node newNode = new Node(newData);
        boolean isTail = this.tail.data.equals(data);
        if (isTail) {
            append(newData);
        } else {
            Node current = this.head;
            while (current.next != null) {
                if (current.data.equals(data)) {
                    Node temp = current.next;
                    current.next = newNode;
                    newNode.next = temp;
                }
                current = current.next;
            }
        }
    }

    public static LinkedList zipLists(LinkedList firstList, LinkedList secondList) {

        Node currentNode1 = firstList.head;
        Node currentNode2 = secondList.head;
        LinkedList newLinkedList = new LinkedList();
        while (currentNode1 != null || currentNode2 != null) {
            if (newLinkedList.head == null) {
                if (currentNode1 != null) {
                    newLinkedList.insert(currentNode1.value);
                    currentNode1 = currentNode1.next;
                } else {
                    newLinkedList.insert(currentNode2.value);
                    currentNode2 = currentNode2.next;
                }
                if (currentNode1 != null) {
                    newLinkedList.append(currentNode1.value);
                    currentNode1 = currentNode1.next;
                }
                if (currentNode2 != null) {
                    newLinkedList.append(currentNode2.value);
                    currentNode2 = currentNode2.next;
                }

            }

            

        }
        return newLinkedList;
    }
}









