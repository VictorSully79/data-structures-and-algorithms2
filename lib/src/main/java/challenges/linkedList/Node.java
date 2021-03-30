package challenges.linkedList;

public class Node {
    public String value;
    public String data;
    public Node next;
    public Node prev;
    public Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
