package leetcode;

import java.util.ArrayList;

class MinStack {
    int pointer = 0; //point the minimum one in the order.
    ArrayList<Integer> stack = new ArrayList<Integer>(); //put the integer into the stack.
    ArrayList<Integer> order = new ArrayList<Integer>(); //this arraylist is used to store the integer in order.
    public void push(int x) { 
        stack.add(x);
        if(order.isEmpty()) order.add(x);
        //find the position of x in ArrayList order and put it into the ArrayList.
        for(int i=0; i<order.size(); i++){ 
            if(x>order.get(i))order.add(i,x);
        }
    }

    public void pop() {
        stack.remove(stack.size()-1);
        order.remove(stack.get(stack.size()-1));
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        return order.get(order.size()-1);
    }    
}
