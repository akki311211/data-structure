package tree;

public class Node {
    int val;

    int hd = Integer.MAX_VALUE;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        left=right=null;
    }
}
