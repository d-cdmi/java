import java.util.*;
public class stack2 {
    static class Node {
    
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // static class Stack {
    //     static Node head = null;
        
    //     public static boolean isEmty() {
    //         return head == null;
    //     }

    //     public static void push(int data){
    //         Node newNode = new Node(data);
    //         if (isEmty()) {
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode; 
    //     }

    //     public static int pop () {
    //         if (isEmty()) {
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     public static int peek() {
    //         if (isEmty()) {
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }

        //q2

        public static void pushAtBottom(Stack<Integer> s , int data) {
            if (s.empty()) {
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(s, data);  
            s.push(top);
        }

    public static void main(String[] args) {
        // Stack s = new Stack();
        Stack<Integer> s = new Stack<>();
        s.push(1);        
        s.push(2);        
        s.push(3);
        
        pushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
          
        }
    
    
    }
}
