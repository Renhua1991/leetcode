package leetcode;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		if(digits == null || digits.length == 0) return digits;
        int mark = 1;
        int length = digits.length;
        for(int i = length - 1; i >= 0; i--){
            int digit = (digits[i] + mark) % 10;
            mark = (digits[i] + mark) / 10;
            digits[i] = digit;
            if(mark == 0) return digits;
        }
        int[] res = new int[length+1];
        res[0] = 1;
        return res;
    }
}
