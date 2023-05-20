package tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView extends Tree{
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        printBottom(root);
    }
    private static void printBottom(Node root){
        int hd = 0;
        Queue<Node> q = new LinkedList<>();
        root.hd= hd;
        q.add(root);
        Map<Integer, Integer> map = new TreeMap<>();
        while(!q.isEmpty()){
            Node temp = q.poll();
            hd = temp.hd;
            map.put(hd, temp.val);
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
