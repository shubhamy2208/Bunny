package linklist;
class node{
    int data ;
    node next;

    node(int d){
        this.data = d ;
        this.next=null;
       
    }
 class basicsofLL {}
    public static void main(String[] args) {
        node n = new node(34);
        node m = new node(35);
        node o = new node(36);
        node p = new node(37);
        node q = new node(38);
        node r = new node(39);
        n.next=m;
        m.next=o;
        o.next=p;
        p.next=q;
        q.next=r;
       System.out.println("n.data = " + n.data);
       System.out.println("n.data = " + n.next);
       System.out.println("n.data = " + m.data);
       System.out.println("n.data = " + m.next);
    }
}
