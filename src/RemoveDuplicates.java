/**
 * Created by haohao on 17-7-13.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j])
                j++;
            else
                nums[++i] = nums[j++];
        }
        return i + 1;
    }
}
