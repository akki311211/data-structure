package tree;

public class Tree {
    public static void printInorder(Node n1){
        if(n1 == null){
            return;
        }
        printInorder(n1.left);
        System.out.print(n1.val+" ");
        printInorder(n1.right);
    }
}
