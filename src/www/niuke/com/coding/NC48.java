package www.niuke.com.coding;

/**
 * @author liyuan zheng
 * @date 2020/12/2 22:45
 * 在转动过的有序数组中寻找目标值
 */
public class NC48 {
    public int search (int[] nums, int target) {
        // write code here
        if(nums.length==1 && nums[0] == target){
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int mid = left+right>>1;
            if(nums[mid] >= nums[left]){
                if(nums[left]<=target&&target<=nums[mid]){
                    right = mid;
                }else {
                    left = mid+1;
                }
            }else{
                if(nums[mid]<target&&target<=nums[right]){
                    left = mid+1;
                }else {
                    right = mid;
                }
            }
        }
        return nums[left] == target?left:-1;
    }

    public static void main(String[] args) {
        int[] aaa = new int[]{6,8,10,0,2,4};
        NC48 nc48 = new NC48();
        System.out.println(nc48.search(aaa,0));
    }
}
