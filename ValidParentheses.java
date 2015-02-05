package leetcode;

import java.util.Stack;

//stack & array. Attention: charAt(i), stack.pop() 
public class ValidParentheses {
	public static boolean isValid(String s) {
		Stack stack = new Stack();
        char[] array = s.toCharArray();
        int result;
        for(int i=0; i<array.length; i++){
            if(array[i]=='(' || array[i]=='{' || array[i]=='['){
                stack.push(array[i]);
            }else if(array[i]==']'){
                if(stack.empty() || !stack.peek().equals('[')){return false;}
                else{stack.pop();}
            }else if(array[i]==')'){
                if(stack.empty() || !stack.peek().equals('(')){return false;}
                else{stack.pop();}
            }else if(array[i]=='}'){
                if(stack.empty() || !stack.peek().equals('{')){return false;}
                else{stack.pop();}
            }
        }
        if(!stack.empty()){return false;}
        return true;
    }
	
	public static void main(String[] args){
		boolean x;
		x = isValid("[]");
		System.out.print(x);
	}
}
