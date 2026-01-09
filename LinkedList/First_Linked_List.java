package LinkedList;

public class First_Linked_List {


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


    // add First
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


    // add at random index
    public void addIndex(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }


    // add at last index
    public void addLast(int data){ //O(1)
        // create new node
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
            }

        tail.next=newNode;

        tail=newNode;
    }

    // delete first node
    public void deleteFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        head=head.next;
        size--;
    }


    // delete last node
    public void removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        //prev=size-2
        int i=0;
        Node prev=head;
        while(i<size-2){
            prev=prev.next;
            i++;
        }
        prev.next=null;
        tail=prev;
        size--;
    }


    // find element using iteration
    public int iterativeSearch(int key){
        if(size==0){
            System.out.println("LL is empty");
            return -1;
        }
        int idx=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key)
            return idx;
            temp=temp.next;
            idx++;
        }
        return -1;
    }


    // find element using recursion
    public int recursiveSearch(int key,Node temp,int idx){
        if(temp==null)
        return -1;

        if(temp.data==key){
            return idx;
        }
        return recursiveSearch(key, temp.next, idx+1);
    }


    public void reverseLinkedList(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public void RecursiveReverseLinkedList(Node prev,Node curr){
        if(curr==null){
        head=prev;
        return ;
        }
             Node next=curr.next;
             curr.next=prev;
             RecursiveReverseLinkedList(curr,next);
        
    }



    public void Remove_Nth_From_End(int n){
        if(n==size){
            head=head.next;
            return;
        }
        int idxToFind=size-n;
        int i=1;
        Node prev=head;
        while(i<idxToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }

    // slow-fast approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//slow is the mid node
    }


    public boolean palindrome(){
        if(head==null || head.next==null)
        return true;

        //find mid
        Node midNode=findMid(head);

        // reverse the 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;//right half head
        Node left=head;

        // check left and right half
        while(right!=null){
            if(left.data!=right.data)
            return false;
            left=left.next;
            right=right.next;
        }
        return true;

    }


    //Finding a cycle in linked list
    public boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return true;//cycle exists
        }
        return false;//cycle doesn't exists
    }



    // To remove cycle
    public void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false)
        return;

        //find meeting point
        slow=head;
        
        // special case: cycle starts at head
        if (slow == fast) {
            // move fast until last node in cycle
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null; // break the cycle
            return;
        }
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            fast=fast.next;
            slow=slow.next;
        }

        // remove cycle
        prev.next=null;
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
        First_Linked_List ll=new First_Linked_List();

        // ll.addFirst(1);

        // ll.addFirst(2);

        // ll.addLast(1);

        // ll.addLast(2);

        // ll.addIndex(2, 1);

        // ll.deleteFirst();

        // ll.removeLast();

        // ll.reverseLinkedList();
        // ll.RecursiveReverseLinkedList(null, head);

        // ll.print();

        // System.out.println("Element found at: "+ll.iterativeSearch(10));
        // System.out.println("Element found at: "+ll.recursiveSearch(8, head, 0));
        
        // ll.Remove_Nth_From_End(3);

        // ll.print();

        // System.out.println(ll.findMid(head).data);

        // if(ll.palindrome())
        // System.out.println("Palindrome");
        // else
        // System.out.println("Not Palindrome");

        // System.out.println("Size of linked list: "+ll.size);


        head=ll.new Node(1);
        head.next=ll.new Node(2);
        head.next.next=ll.new Node(3);
        head.next.next.next=head;
        
        System.out.println(ll.isCycle());
        ll.removeCycle();
        System.out.println(ll.isCycle());
    }

}
