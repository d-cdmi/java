import java.util.*;

public class LinkedList {
    
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        } 
        
    }
    public static Node head;
    public static Node tail;

    public void addfist(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addlast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public  void print() {
        if(head==null) {
            System.out.println("Linked is MT");
            return;
        }
        Node temp = head;
        while ( temp!= null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" Null ");

    }
    public void add (int idx ,int data) {
        if (idx == 0) {
            addfist(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        
        while (i< idx-1) {
            temp =temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addfist(2);
        ll.addfist(1);
        ll.addlast(3);
        ll.addlast(4);

        ll.add(2, 10);

        ll.print();
    }
}
