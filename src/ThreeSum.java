import java.util.*;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){
            if(i > 0 && nums[i-1] == nums[i]) continue;
            int l = i+1, r = nums.length-1;
            int sum = 0 - nums[i];
            while(l < r){
                if(nums[l] + nums[r] == sum){
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l < r && nums[l] == nums[l+1]) l++;
                    l++;
                    while(l < r && nums[r] == nums[r-1]) r--;
                    r--;
                } else if(nums[l] + nums[r] > sum){
                    r--;
                } else {
                    l++;
                }
            }
        }
        
        return res;
    }
}
