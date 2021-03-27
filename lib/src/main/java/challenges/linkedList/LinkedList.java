package challenges.linkedList;


public class LinkedList {
    public Node head = null;
    public Node tail = null;

    public void insert(String data) {
        Node newNode = new Node(data);

        if(this.head==null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;

        if(this.head==null) {
            System.out.println("List is Empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean includes(String x){
        Node current = this.head;
        while (current != null){
            if (current.data.equals (x))
                return true;
            current = current.next;
        }
        return false;
    }

}


