package www.niuke.com.coding;

/**
 * 请实现有重复数字的升序数组的二分查找
 * 给定一个 元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的第一个出现的target，如果目标值存在返回下标，否则返回 -1
 */
public class NC1052 {
    public int search (int[] nums, int target) {
        // write code here
        if(nums == null ||nums.length == 0){
            return -1;
        }
        int low = 0;
        int high = nums.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                //找到，循环获取第一个出现的
                while (mid>=0){
                    if(nums[mid] == target){
                        mid--;
                    }else{
                        break;
                    }
                }
                return mid+1;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,2,3,4,5,6,7};
        NC1052 nc1052 = new NC1052();
        System.out.println(nc1052.search(nums,2));
    }
}
