import java.util.Stack;
public class PushBottomStack {
    public static void pushBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(data,s);
        s.push(top);
    }

    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(53);
        s.push(89);
        s.push(75);
        s.push(3);
        int k=s.size()-1;
        while(k>=0){
            System.out.print(s.get(k)+" ");
            k--;
        }
        System.out.println();
        System.out.println("After the elemet in added at the bottom of the Stack");

        pushBottom(0,s);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }

    }
    
}
