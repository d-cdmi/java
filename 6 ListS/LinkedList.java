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
    public static int size;

    public void addfist(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
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
        size++;
        Node temp = head;
        int i = 0;
        
        while (i< idx-1) {
            temp =temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFist() {
        if(size==0) {
            System.out.println("link List Is Mt");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head =head.next;
        size--;
        return val;
    }
    public int removeLast() {
        if(size==0) {
            System.out.println("link List Is Mt");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node prev =  head;
        for (int i =0;i< size-2;i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key) {
        Node temp = head;
        int i=0;
        while (temp!=null) {
            if (temp.data == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if(head==null) {
            return -1;
        } 

        if (head.data==key) {
            return 0;
        }
        int idx = helper(head.next, key) ;
        if (idx == -1) {
            return -1;
        }

        return idx +1;
    }

    public int ReSerach(int key) {
        return helper(head ,key);
    }

    public void Rever(){
        Node prev = null;
        Node curr = tail = head;
        Node next ;
        
        while (curr != null) {
            next = curr.next;
            curr.next =prev;
            prev =curr;
            curr =next;
        }
        head =prev;
    }

    public void deleteLastto(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if(n == sz ) {
            head =head.next;
            return ;
        }

        int i=1;
        int iToend = sz-n;
        Node prev = head;
        while (i<iToend) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid (Node head) {
        Node slow = head;
        Node fast = head;
    
        while (fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;   //my mid 
    
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node mid = findMid(head);

        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while (right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addfist(2);      
        ll.addfist(1);
        ll.addlast(1);
        ll.addlast(4);
        ll.addlast(5);

        // ll.print();
        // ll.removeFist();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.ReSerach  (4 ));
        // System.out.println(ll.ReSerach(11));
        // System.out.println(ll.size);
        
        // ll.print();
        // ll.Rever();
        // ll.deleteLastto(3);
            
        ll.print();
  
        System.out.println(ll.checkPalindrome());
    }
}
