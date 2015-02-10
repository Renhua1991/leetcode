package leetcode;

import java.util.ArrayList;

public class Min_stack {
	int pointer=0; //point the minimum one in the order.
    ArrayList<Integer> stack = new ArrayList<Integer>(); //put the integer into the stack.
    
    public void push(int x) { 
        stack.add(x);
        if(x<=stack.get(pointer)) pointer=stack.size()-1;
    }

    public void pop() {
        if(stack.get(stack.size()-1)==stack.get(pointer)){
            pointer=0;
            for(int i=0;i<stack.size()-1;i++){
                if(stack.get(i)<=stack.get(pointer)) pointer=i;
            }
        }
        stack.remove(stack.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        return stack.get(pointer);
    }
}
