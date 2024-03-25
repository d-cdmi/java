/**
 * DoubleLL
 */
public class DoubleLL {

    public class Node {
    
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    
    //add Fist
    public void addfist(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode ;
            return;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //addLast

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = null;
            return;
        }
       tail.next = newNode;
       tail = newNode;
       tail.next = null;

    }

    //print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove - Fist 
    public int removeFist () {
        if(head == null) {
            System.out.println("dLL is Mt");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int var = head.data;
            head = tail = null;
            size--;
            return var;
        }

        int var = head.data;
        head = head.next;
        head.prev = null;

        return var;
    }

    public int removeLast () {
        if(head == null) {
            System.out.println("Dll is MT");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int var = head.data;
            head = tail = null;
            size--;
            return var;
        }

        size--;
        int var = head.data;
        tail = tail.prev;
        tail.next = null;
        
        return var;

    }

    public void reverse () {
        Node curr = head;
        Node prve = null;
        Node next ;

        while (curr != null) {
            next = curr.next;
            curr.next = prve;
            curr.prev = next;

            prve = curr;
            curr = next;
        }
        head = prve;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addfist(3);
        dll.addfist(2);
        dll.addfist(1);
        dll.addLast(10);        
        dll.print();
        // dll.reverse();
        dll.print();

        // System.out.println(dll.size);
        
        // dll.removeLast();
        // dll.print();
        // System.out.println(dll.size);
        

    }

}
