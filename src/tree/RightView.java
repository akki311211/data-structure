package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *           1
 *        /     \
 *      2         3
 *    /   \       /  \
 *   4     5   6      7
 *        /              \
 *       9               8
 */
public class RightView extends Tree {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.left = new Node(2);
        n1.right = new Node(3);
        n1.left.left = new Node(4);
        n1.left.right = new Node(5);
        n1.left.right.left = new Node(9);
        n1.right.left = new Node(6);
        n1.right.right = new Node(7);
        //n1.right.right.right = new Node(8);
        printInorder(n1);
        System.out.println();
        printLeft(n1);
    }
    private static void printLeft(Node n1){
        Queue<Node> q = new LinkedList<>();
        q.add(n1);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0; i<n; i++){
                Node temp = q.poll();
                if(i==n-1){
                    System.out.print(temp.val+" ");
                }
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
    }
}
