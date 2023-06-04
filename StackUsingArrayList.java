import java.util.ArrayList;
public class StackUsingArrayList {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public boolean isEmpty(){
            return (list.size()==0);
        }

        public void push(int data){
            list.add(data);
        }
        
        public int pop(){
            if(isEmpty())
            return -1;

            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if(isEmpty())
            return -1;
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(53);
        s.push(89);
        s.push(75);
        s.push(3);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
