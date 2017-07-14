import java.util.Arrays;

/**
 * Created by haohao on 17-7-14.
 */
public class RemoveElement {
    public static int removeElementWithOrder(int[] nums, int val) {
        int i = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != val){
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public static int removeElementWithoutOrder(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            if(nums[i] == val){
                //n表示有效长度，每找到一个val，有效长度减一
                nums[i] = nums[n-1];
                n--;
            }
            else
                i++;
        }
        return n;
    }

    public static void main(String[] args){
        int[] nums = {3,4,5,2,1,4};
        int s = RemoveElement.removeElementWithOrder(nums, 5);
        System.out.println(s);
        System.out.println(Arrays.toString(nums));
    }
}
