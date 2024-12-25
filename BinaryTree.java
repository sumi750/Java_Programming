import java.util.*;
public class BinaryTree {
    public BinaryTree(){
 
    }

    private static class Node{
        private int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    private Node root;

    //Inert Root element
    public void populate(Scanner sc){
        System.out.println("Enter the root element : ");
        int data = sc.nextInt();
        root = new Node(data);
        populate(sc, root);
    }


    //Insert the left and right of tree using a Root Node
    private void populate(Scanner sc , Node node){
        System.out.println("Do you want to insert Left of " + node.data);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Insert the left of " + node.data);
            int data = sc.nextInt();
            node.left = new Node(data);
            populate(sc, node.left);
        }

        System.out.println("Do you want to insert right of "+ node.data);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Insert the right of " + node.data);
            int data = sc.nextInt();
            node.right = new Node(data);
            populate(sc,node.right);
        }
    }

    //Display Method
    public void display(){
        display(root);
    }

    private void display(Node node){
        if(node == null){
            return;
        }

        System.out.print(" "+node.data+ " ");
        display(node.left);
        display(node.right);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        System.out.println("InOrder Trversal for tree");
        tree.display();
    }
}
