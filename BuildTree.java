import java.util.*;

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


        //Level Order Traversal (LeetCode)
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

        //Largest element in ecah row (LeetCode)
        public static void largestValue(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int size = q.size();
                int max = Integer.MIN_VALUE;
                for(int i = 0; i<size; i++){
                    Node curr = q.remove();
                    if(curr.left != null) q.add(curr.left);
                    if(curr.right != null) q.add(curr.right);
                    max = Math.max(max, curr.data);
                }
                System.out.println(max);
            }   
        }

        //DiaMeter of Tree T.C (O(N^2))
        public static int diameter(Node root){
            if(root == null) {return 0;}

            int leftDiam = diameter(root.left);
            int leftHeight = heightT(root.left);
            int rightDiam = diameter(root.right);
            int rightHeight = heightT(root.right);

            int selfDiam = leftHeight + rightHeight + 1;

            return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
        }

        //DiaMeter of Tree T.C ---> Liner
        //Info Class
        static class Info{
            int diam;
            int ht;
            public Info(int diam, int ht){
                this.diam = diam;
                this.ht = ht;
            }
        }
        
        public static Info diamMeter(Node root){

            if(root == null){
                return new Info(0,0);
            }
            Info leftInfo = diamMeter(root.left);
            Info rightInfo = diamMeter(root.right);
            
            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
            
            return new Info(diam,ht);   //returning new object with diam and height

        }

        //Reverse Level Order traversal
        public static void  ReverseOrder(Node root){
            if(root == null) {
                return;
            }

            Stack<Node> st = new Stack<>();
            Queue<Node> q = new LinkedList<>();

            q.add(root);
            while(!q.isEmpty()){
                Node curr = q.poll();
                st.push(curr);

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }

            while(!st.isEmpty()){
                System.out.print(st.pop().data + " ");
            }
        }

        //Kth level of Tree
        public static void KthLevel(Node root, int level, int k){
            if(root == null){
                return;
            }

            if(level == k){
                System.out.print(root.data+ " ");
                return;
            }

            KthLevel(root.left, level+1, k);
            KthLevel(root.right, level+1, k);
        }

        //Sum of Kth level root
        public static int KthLevelSum(Node root, int level, int k ){
            if(root == null){
                return 0;
            }

            if(level == k){
                return root.data;
            }

            return KthLevelSum(root, level+1, k) + KthLevelSum(root.right, level+1, k);
        }

        // level of Maximum sum of Binary Tree (LeetCode)
        public static int maxLevelSum(Node root){
            if(root == null){
                return 0;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            int ans = 1;
            int level = 1;
            int maxSum = root.data;

            while(!q.isEmpty()){
                int levelSum = 0;
                int size = q.size();
                for(int i = 0; i<size; i++){
                    Node curr = q.remove();
                    levelSum += curr.data;
                    if(curr.left != null) q.add(curr.left);
                    if(curr.right != null) q.add(curr.right);
                }

                if(levelSum>maxSum){
                    maxSum = levelSum;
                    ans = level;
                }

                level++;
            }
            return ans;
        }
    }



    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,2,-1,-1};
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
        System.out.println("Largest element in each row ");
        tree.largestValue(root);
        System.out.println("Diameter of tree is " + tree.diameter(root));
        System.out.println("Diameter of tree using Liner complexity "+ tree.diamMeter(root).diam);
        System.out.println("Reeverse level order tarversla");
        tree.ReverseOrder(root);
        System.out.println();
        int k = 2;
        System.out.print("let level is "+ k + " show the node are ");
        tree.KthLevel(root, 0, k);
        System.out.println();
        int sum = tree.KthLevelSum(root, 0, k);
        System.out.println(sum);

        System.out.println("Level of Maximum sum is "+ tree.maxLevelSum(root));

    }
    
}
