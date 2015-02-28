package leetcode;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
        int length = s.toCharArray().length;
        char[] ch = s.toCharArray();
    
        int newLength = length;
        for(int i=length-1; i>=0; i--){
            if(ch[i] != ' ') break;
            if(ch[i] == ' ') newLength--;
        }
    
        int result = 0;
        for(int i=0; i<=newLength-1; i++){
            if(ch[i] != ' ') {result++;}
            else {result = 0;}
        }
        
        return result;
    }
}
