import java.util.Stack;

public class BuiltInStack {
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
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
