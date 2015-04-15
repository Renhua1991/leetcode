package leetcode;

public class CountAndSay {
	
	public String countAndSay(int n) {
        if(n<=0) return "";

        String str = "1";
        for(int i=1; i<n; i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int j=1; j<str.length(); j++){
                if(str.charAt(j) == str.charAt(j-1)) count++;
                else{
                    sb.append(count);
                    sb.append(str.charAt(j-1));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(str.charAt(str.length()-1));
            str = sb.toString();
            sb.setLength(0);
        }
        
        return str;
    }
}
