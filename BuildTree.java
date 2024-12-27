import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BuildTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BTree{

        //Building a Tree
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        
        //Pre Order
        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        
        //In order
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }
        
        //Post Order
        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }


        //Level Order Traversal
        public static void LevelOrder(Node root){
            if(root ==  null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()) break;
                    else q.add(null);
                }
                else{
                    System.out.print(currNode.data+ " ");
                    if(currNode.left != null){
                        q.add((currNode.left));
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        //Height of Tree
        public static int heightT(Node root){
            if(root == null){
                return 0;
            }
            
            int lh = heightT(root.left);
            int rh = heightT(root.right);
            return Math.max(lh, rh) + 1;     
        }

        //Count Of Nodes
        public static int nodeCount(Node root){
            if(root == null){
                return 0;
            }
            int lcount = nodeCount(root.left);
            int rcount = nodeCount(root.right);
            return lcount + rcount + 1;
        }

        //Sum of Nodes
        public static int sum(Node root){
            if(root == null) return 0;
            int lsum = sum(root.left);
            int rsum = sum(root.right);
            return lsum + rsum + root.data;
        }

        //Largest element in ecah row

        public static void largestValue(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            
            
        }


    }



    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Pre Order Traversal");
        tree.preOrder(root);
        System.out.println("In Order traversal");
        tree.inorder(root);
        System.out.println("Post Order Traversal");
        tree.postOrder(root);
        System.out.println("Level Order Traversla");
        tree.LevelOrder(root);
        System.out.println();
        System.out.println("Height of Tree : " + tree.heightT(root));
        System.out.println("Count of Node " + tree.nodeCount(root));
        System.out.println("Sum of nodes " + tree.sum(root));
    }
    
}
