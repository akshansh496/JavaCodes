package LinkedList;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    } 

    public static Node head;
    public static Node tail;
    public static int size;


    // add first
    public void addFirsNode(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }



    // add last
    public void addLastNode(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        Node temp=tail;
        tail.next=newNode;
        tail=newNode;
        tail.prev=temp;
        tail.next=null;
    }

    // remove first
    public void removeFirst(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }



    // remove last
    public void removeLast(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }


    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // print
    public void print(Node head){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        System.out.print("null<->");
        while(temp!=null){
            System.err.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirsNode(3);
        dll.addFirsNode(2);
        dll.addFirsNode(1);
        dll.addLastNode(4);

        dll.print(head);
        System.out.println(size);

        // dll.removeFirst();
        // dll.print(head);
        // System.out.println(size);

        // dll.removeFirst();
        // dll.print(head);
        // System.out.println(size);


        dll.reverse();
        dll.print(head);
        System.out.println(size);
    }
}
