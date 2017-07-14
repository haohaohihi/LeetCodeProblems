/**
 * Created by haohao on 17-7-14.
 */
public class SearchInsert {
    //O(n) Solution
    public int searchInsert1(int[] nums, int target) {
        int i = 0;
        int n = nums.length;
        int j = n - 1;
        while((i <= n - 1) && (nums[i] < target))
            i++;
        while((j >= 0) && (nums[j] > target))
            j--;
        if(j < 0) return 0;
        else if(i >= n) return n;
        else    return i;
    }

    //O(logn) Solution
    public int searchInsert2(int[] nums, int target){
        int low = 0;
        int hi = nums.length - 1;
        while(low <= hi){
            int mid = (low + hi) / 2;
            if(nums[mid] == target)    return mid;
            else if(nums[mid] > target)
                hi = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
