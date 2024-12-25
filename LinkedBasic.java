public class LinkedBasic {
    public static class Node{
        int data;
        Node next; // Adres of Next Node
        Node(int data){
            this.data = data;

        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);
        
        //5->4->3->2->1 Linked
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        


    }
}
