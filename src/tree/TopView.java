package tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 *               1
 *            /     \
 *          2       3
 *        /  \    / \
 *      4    5  6   7
 */
public class TopView extends Tree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //printInorder(n1);
        System.out.println();
        printTop(root);
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        System.out.println();
        printTop(root);
    }
    private static void printTop(Node root){
        int hd = 0;
        Queue<Node> q = new LinkedList<>();
        root.hd= hd;
        q.add(root);
        Map<Integer, Integer> map = new TreeMap<>();
        while(!q.isEmpty()){
            Node temp = q.poll();
            hd = temp.hd;
            if(!map.containsKey(hd)) {
                map.put(hd, temp.val);
            }
            if(temp.left != null){
                temp.left.hd = hd-1;
                q.add(temp.left);
            }
            if(temp.right != null){
                temp.right.hd = hd+1;
                q.add(temp.right);
            }

        }
        for(Map.Entry e : map.entrySet()){
            System.out.print(e.getValue()+" ");
        }

    }
}
