package tree;

public class Diameter {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        Tree.printInorder(root);
        System.out.println("\nDiameter"+dia(root));
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.println("Diameter"+dia(root));
    }
    private static int dia(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ld = dia(root.left);
        int rd = dia(root.right);
        return Math.max(Math.max(ld, rd), lh+rh+1);
    }
    private static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }
}
