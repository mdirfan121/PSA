public class NodeList {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static Node head = null;
    public static void main(String[] args) {
        insert_end(10);
        insert_end(20);
        print();

    }
    public static void insert_end(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next!=null) {
                temp  = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public static void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
