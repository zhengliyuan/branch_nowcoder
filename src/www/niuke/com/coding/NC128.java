package www.niuke.com.coding;

/**
 * 给定一个整形数组arr，已知其中所有的值都是非负的，将这个数组看作一个容器，请返回容器能装多少水
 */
public class NC128 {
    public long maxWater (int[] arr) {
        // write code here
        if(arr.length == 0 || arr == null){
            return 0;
        }
        int sum = 0;
        int l = 0;
        int r = arr.length-1;
        int lmax = arr[0];
        int rmax = arr[arr.length-1];
        while (l<=r){
            lmax = Math.max(arr[l],lmax);
            rmax = Math.max(arr[r],rmax);
            if(lmax<rmax){
                sum += lmax-arr[l];
                l++;
            }else{
                sum += rmax-arr[r];
                r--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] num = new int[]{10000,1,1,1,1,1};
        NC128 nc128 = new NC128();
        System.out.println(nc128.maxWater(num));
    }
}
