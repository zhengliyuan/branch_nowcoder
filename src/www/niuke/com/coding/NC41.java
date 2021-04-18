package www.niuke.com.coding;

/**
 * @author liyuan zheng
 * @date 2020/12/13 19:42
 * 找到字符串的最长无重复字符子串
 */
public class NC41 {
    public int maxLength (int[] arr) {
        int[] lastPos = new int[100005];
        int len = arr.length;
        int start = 0;
        int res = 0;
        for(int i =0;i<len;i++){
            int now = arr[i];
            start = Math.max(start,lastPos[now]);
            res = Math.max(res,i-start+1);
            lastPos[now] = i+1;
        }

        return res;
    }

    public static void main(String[] args) {
        NC41 nc41 = new NC41();
        nc41.maxLength(new int[]{2,2,3,4,3});
    }
}
