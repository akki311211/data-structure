package linkedlist;

public class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }

    public static void print(Node head){
        System.out.println();
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}
