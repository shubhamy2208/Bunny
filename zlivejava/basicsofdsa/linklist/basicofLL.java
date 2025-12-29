// ek box banana 
class Node{
    int data ;
    Node next;

    Node(int data){
        this.data = data;
        this.next=null;
    }
};
public class basicofLL{
    public static void display(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
    public static void main(String[] args) {

        // creating a node 
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // linking a node ,connecting a node 
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        // print the node and the address or next node 
display(a);
    }
}