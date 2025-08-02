package doubley_LL;

import org.w3c.dom.Node;

class dNode{
    int val;
    dNode next;
    dNode prev;

    dNode(int val){
        this.val=val;
    }
}
class DLL{
    dNode head;
    dNode tail;
    int size;

    void  Display(){
        dNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void InserAtTail(int val){
        dNode temp = new dNode(val);
        if(size==0) head=tail=temp;
        else {
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;

    }

    void InserAtHead(int val){
        dNode temp = new dNode(val);
        if(size==0) head=tail=temp;
        else {
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }

    void InsertAtGivenIndex(int indx , int val ){
        if(indx == 0){
            InserAtHead(val);
            return;
        }
        if(indx==size){
            InserAtTail(val);
            return;
        }
        if(indx>size || indx<0){
            System.out.println("Invalid Index");
            return;
        }
        dNode temp = new dNode(val);
        dNode x =head;
        for (int i = 0; i <indx-1; i++) {
            x=x.next;
        }
        dNode y =x.next;
        x.next=temp;
        temp.prev=x;
        y.prev=temp;
        temp.next=y;
        size++;
    }

    void DeleteAtHead(){
        if(head==null)  {
            System.out.println("The empty list ");
        }
        head=head.next;
        head.prev=null;
        size--;
    }

    void DeleteAtTail(){
        if(head==null)  {
            System.out.println("The empty list ");
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }

    void DeleteAtGivenIndex(int idx){
        if(idx==0){
            DeleteAtHead();
        }
        if(idx==size-1){
            DeleteAtTail();
        }
        if(idx<0 || idx>=size){
            System.out.println("Invalid index");
        }
        dNode temp =head;
        for (int i = 0; i < idx-1; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp=temp.next;
        temp.prev=temp.prev.prev;
        size--;

    }
}
public class Implementation {

    public static void print(dNode head){
        dNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void Reverse_print(dNode tail){
        dNode temp = tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
    }
    public static void Random_print(dNode node){
        dNode temp = node;
        while (temp!=null){
            temp=temp.prev;
        }
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
      // dNode a = new dNode(10);
        //dNode b = new dNode(20);
       // dNode c= new dNode(30);

      //  dNode d = new dNode(40);
      //  dNode e = new dNode(50);
      //  dNode f = new dNode(60);
      //  a.next=b; b.prev=a;
      //  b.next=c;c.prev=b;
      //  c.next=d;d.prev=c;
      //  d.next=e;e.prev=d;


       // print(a);
//Reverse_print(e);
      //  Random_print(c);
        DLL lis = new DLL();
        lis.InserAtTail(10);
        lis.InserAtTail(20);
        lis.InserAtTail(30);
        lis.InserAtTail(40);
        lis.Display();
        lis.InserAtTail(57);
        lis.Display();
        lis.InserAtHead(100);
//        lis.Display();
        lis.InsertAtGivenIndex(4,200);
        lis.Display();
        lis.DeleteAtHead();
        lis.Display();
        lis.DeleteAtTail();
        lis.Display();
        lis.DeleteAtGivenIndex(2);
        lis.Display();
    }
}
