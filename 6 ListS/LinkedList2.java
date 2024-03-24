import java.util.LinkedList;
public class LinkedList2 {
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

    public boolean isCycal() {   // floyd's CFA
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycal() {
        Node fast = head;
        Node slow = head;
        boolean cycal = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycal = true;
                break;
            }
        }
        if (cycal==false) {
            return;
        }
        slow = head;
        Node prve = null;
        while (slow != fast) {
            prve =fast;
            fast = fast.next;
            slow = slow.next;
        }
        prve.next = null;
    }

    // merge short
    public Node mergeSort(Node head) {
        if(head == null ||  head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
    
    }

    public Node merge(Node head1,Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp =temp.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
                temp =temp.next;
                
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp =temp.next;            
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        
        return mergeLL.next;
        
    }
    
    public  Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast ==null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }  
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




    public void zigzag() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //2 revers
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next ;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }   

        Node left = head;
        Node right = prev;
        Node nextL , nextR;


        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        
        }
    }


    public static void main(String args[]) {
        // LinkedList<Integer> sl = new LinkedList<>();
        LinkedList2 ll = new LinkedList2();
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = head.next;
        
        // System.out.println(ll.isCycal());
        // ll.removeCycal();
        // System.out.println(ll.isCycal());
        

        //merge short
        // ll.addfist(1);
        // ll.addfist(2);
        // ll.addfist(3);
        // ll.addfist(4);
        
        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();
        
        //zigzok
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);

        ll.print();
        ll.zigzag();
        ll.print();

    }
}
