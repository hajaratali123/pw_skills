package linked_list.doubley_LL;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class Sll {
    Node head;
    Node tail;
    int size;
    void InsertAtEnd(int val ){
        Node temp = new Node(val);
        if(head==null)head=tail=temp;
        else {
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void InsertAtHead(int val ){
        Node temp = new Node(val);
        if(head==null)head=tail=temp;
        else {
           temp.next=head;
           head=temp;
        }
        size++;
    }
    void InsertAtGivenPos(int index,int val ){
        if(index==0){
            InsertAtHead(val);
            return;
        }
        if(index==size){
            InsertAtEnd(val);
            return;
        }
        if(index>size){
            System.out.println("Invalid Index !!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;

        for (int i = 1; i <=index-1; i++) {
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;

        size++;
    }
    int getElementBYIndex(int idx){
        if(idx==size-1) return tail.val;
        if(idx==0) return head.val;
        if(idx>=size || idx <0){
            System.out.println("Invalid Index");
            return -1;
        }
        Node temp = head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;
        }
        return temp.val;
    }

    // set element By index that overrode the value of current index
    void SetElementBYIndex(int idx,int value){
        if(idx==size-1){
            tail.val=value;
        }
        if(idx==0){
             head.val=value;
        }
        if(idx>=size || idx <0){
            System.out.println("Invalid Index");
        }
        Node temp = head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;
        }
        temp.val=value;
    }
    void  print( ){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void DeleteAtHead() throws  Error{
         if (head==null) throw new Error("The list is Empty ");
         head=head.next;
         size--;
    }
    void DeleteAtGivenIndex(int Index ) throws  Error{
        if(Index==0){
            DeleteAtHead();
            return;
        }
        if(Index>=size || Index<0) new Error("Invalid Index");
        Node temp = head;
        for (int i = 1; i <=Index-1 ; i++) {
            temp=temp.next;
        }
       if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;

    }

    public void MiddleElement(Node head) { // two pass solution
        Node temp = head;
        int len = 0;

        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // Calculate the middle position
        int mid = len / 2-1;

        temp = head;
        // Traverse to the middle element
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
    }


    public void MiddleElement2(Node head) { // slow -fast  pass solution
        Node fast = head ;
        Node slow = head;
        Node prev=null;
        while (fast!=null && fast.next!=null) {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Slow fast method");
       // System.out.println(slow.val);
        System.out.println(prev.val);
    }
    void size(){
        System.out.println("Length of link list "+size);
    }
}

public class implementationLL {
    public static void main(String[] args) {
        Sll list = new Sll();
        list.InsertAtHead(20);
     //   list.size();
      list.InsertAtEnd(10);
      list.InsertAtHead(30);
        list.InsertAtHead(40);
        list.InsertAtHead(50);
        list.InsertAtHead(60);


        //  list.print();
     //   list.InsertAtGivenPos(10,90);
      //  list.size();

      //  list.print();
       // System.out.println(list.getElementBYIndex(0));
      //  list.SetElementBYIndex(2,90);
        list.print();
       // list.DeleteAtGivenIndex(2);
      //  list.print();
       // System.out.println(list.tail.val);
        list.size();
     //  list.MiddleElement(list.head);
        list.MiddleElement2(list.head);






//        list.InsertAtEnd(10);
//        list.size();
//        list.InsertAtEnd(20);
//        list.InsertAtEnd(30);
//        list.InsertAtEnd(40);
//
//        list.print();
//        list.InsertAtEnd(60);
//        list.print();
    }
}
