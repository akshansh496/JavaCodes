package LinkedList;

public class ZigZagLL {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }


    public static Node head;
    public static Node tail;
    public static int size;



    public void addFirst(int data){ //O(1)
        // create new node
        Node newNode=new Node(data);
        size++;

        if(head==null){
        head=tail=newNode;
        return;
        }

        // newNode next=head
        newNode.next=head;//link

        // head=newNode
        head=newNode;

    }


    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    
    public void zigzag(){

        // find mid
        Node mid=getMid(head);

        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev= null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        // alt merge - zigzag merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }

    public void print(){ //O(n)
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ZigZagLL ll=new ZigZagLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        ll.zigzag();
        ll.print();
    }
}
