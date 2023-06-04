public class StackUsingLL
{ static class Node
    {
    int data;
    Node next;
    Node(){}
    Node (int data){
        this.data=data;
        this.next=null;
    }}

    static class Stack{
        public static Node head;
        public Boolean isEmpty(){
            return head==null;
        }
    
    public void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;}
          newNode.next=head;
          head=newNode;  
        
    }

    public int pop(){
        int top=head.data;
        if(isEmpty())
        return -1;
        head=head.next;
        return top;   
    }

    public int peek(){
        if(isEmpty())
        return -1;
        return head.data;  
    }
}

    public static void main(String args[]){
        Stack s=new Stack();
        s.push(20);
        s.push(56);
        s.push(52);
        s.push(96);
        while(!s.isEmpty()){
        System.out.print(s.peek()+" ");
        s.pop();
        }

    }
}