package leetcode;

import static java.lang.Math.pow;

//sum += 26^(length-i-1)*('X'-'A'+1)
public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
        int numberA = (int)'A';
        int length = s.length();
        int sum=0;
        for(int i=0; i<length; i++){
            char ch = s.charAt(i);
            int x = (int)ch-numberA;
            sum+=pow(26,length-i-1)*(x+1);
        }
        return sum;
    }
}
