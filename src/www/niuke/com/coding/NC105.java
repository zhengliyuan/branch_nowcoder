package www.niuke.com.coding;

/**
 * @author liyuan zheng
 * @date 2020/12/2 21:12
 * 带重复数字的二分查找
 */
public class NC105 {
    public int upper_bound_ (int n, int v, int[] a) {
        if(v > a[n-1]){
            return n+1;
        }
        int low = 0;
        int high = a.length;
        while(low<high){
            int mid = low + (high - low)/2;
            if(a[mid]<v){
                low = mid;
            }else{
                high = mid;
            }
        }
        return low+1;
    }
}
