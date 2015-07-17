package leetcode;
import java.util.*;

public class BasicCalculator2 {
	public int calculate(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int num = 0;
        int sign = '+';
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                num = num * 10 + s.charAt(i) - '0';
            }
            
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == s.length() - 1){
                if(sign == '+'){
                    stack.push(num);
                }else if(sign == '-'){
                    stack.push(-num);
                }else if(sign == '*'){
                    stack.push(stack.pop() * num);
                }else if(sign == '/'){
                    stack.push(stack.pop() / num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }
        
        int res = 0;
        for(int x : stack){
            res += x;
        }
        
        return res;
    }
}
