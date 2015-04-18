package leetcode;

import java.util.List;

public class ContainerWithMostWater {
	public int maxArea(List<Integer> height) {
        int area = 0;
        if(height.size()<=1) return area;
        int left = 0;
        int right = height.size()-1;
        
        while(left < right){
            int min_height = (height.get(left)<height.get(right))? height.get(left): height.get(right);
            area = (area > min_height*(right-left))? area: min_height*(right-left);
            if(height.get(left)<height.get(right)) left++;
            else right--;
        }
        
        return area;
    }
}
