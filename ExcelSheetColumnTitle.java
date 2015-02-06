package leetcode;

public class ExcelSheetColumnTitle {
	public static String convertToTitle(int n) {
		//divided by 26 and get the mod. If the mod is 0, set it 'Z'.
		StringBuffer str=new StringBuffer();
		while(n!=0){
			int r=n%26;
			n=n/26;
			if(r==0){
				str.insert(0,'Z');
				n--;
			}else{
				str.insert(0, (char)('A'+r-1));
			}
		}
		return str.toString();
	}
	
	public static void main(String[] args){
		int n=701;
		String s = convertToTitle(n);
		System.out.println(s);
	}
}
