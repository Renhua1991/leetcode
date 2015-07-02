package leetcode;
import java.util.*;

public class SummaryRange {
	public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        
        if(nums.length == 0){
            return list;
        }
        
        for(int i = 0; i < nums.length; i++){
            int mark = nums[i];
            
            while(i + 1 < nums.length && nums[i + 1] - nums[i] == 1){
                i++;
            }
            
            String s = "";
            if(nums[i] != mark){
                s = mark + "->" + nums[i];
            }else{
                s = mark + "";
            }
            
            list.add(s);
        }
        
        return list;
    }
}
