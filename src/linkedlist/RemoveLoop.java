package linkedlist;

public class RemoveLoop {
    public static void main(String[] args) {

        Node head = new Node(50);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        //Node.print(head);
        Node.print(remove(head));

    }
    private static Node remove(Node head){
        Node slow = head;
        Node fast = head;
        slow = slow.next;
        fast = fast.next.next;
        while(fast != null && fast.next != null){
            if (slow == fast)
                break;
            slow= slow.next;
            fast = fast.next.next;
        }
        if(fast == slow){
            slow = head;
            while(slow.next != fast.next){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
        return head;
    }
}
