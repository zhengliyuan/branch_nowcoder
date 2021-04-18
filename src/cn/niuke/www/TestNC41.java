package cn.niuke.www;

/**
 * @author liyuan zheng
 * @date 2020/10/14 22:37
 */
public class TestNC41 {
    public static void main(String[] args) {
        TestNC41 testNC41 = new TestNC41();
        testNC41.maxLength(new int[]{2,2,3,4,3});
    }
    public int maxLength (int[] arr) {
        // write code here
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
}
