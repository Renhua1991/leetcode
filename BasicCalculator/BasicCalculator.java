package leetcode;
import java.util.*;

public class BasicCalculator {
	public int calculate(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int res = 0;
        int sign = 1;
        
        stack.push(1);
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                continue;
            }else if(s.charAt(i) == '('){
                stack.push(sign * stack.peek());
                sign = 1;
            }else if(s.charAt(i) == ')'){
                stack.pop();
            }else if(s.charAt(i) == '+'){
                sign = 1;
            }else if(s.charAt(i) == '-'){
                sign = -1;
            }else{
                int tmp = s.charAt(i) - '0';
                while(i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))){
                    tmp = tmp * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                res += sign * stack.peek() * tmp;
            }
        }
        
        return res;
    }
}
