package DAY_25;

public class Stacks {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public Stacks(){
        this.head=null;
    }
    //isEmpty()
    public boolean isEmpty(){
        return head==null;
    }
    //push(5)
    public void push(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
    }
    //pop()=>5
    public int pop(){
        if(head==null) return -1;
        Node temp=head;
        head=head.next;
        temp.next=null;
        return temp.data;
    }
    //peek()=>top
    public int peek(){
        if(head==null) return -1;
        else return head.data;
    }
    //print stack
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    //size (homework)

    public static void main(String[] args) {
        Stacks stk= new Stacks();
        stk.push(3);
        stk.push(2);
        stk.push(7);
        stk.push(1);
        stk.push(8);
        System.out.println(stk.pop());
        stk.print();
    }
}