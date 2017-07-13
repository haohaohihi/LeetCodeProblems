import java.util.HashMap;

/**
 * Created by haohao on 17-7-13.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            else
                map.put(nums[i], i);
        }
        return new int[]{};
    }
}