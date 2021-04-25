package www.niuke.com.coding;

/**
 * 实现函数 int sqrt(int x).
 * 计算并返回x的平方根（向下取整）
 */
public class NC32 {
    public int sqrt (int x) {
        // write code here
        if(x == 0 || x == 1){
            return x;
        }
        int min = 1;
        while (min*min<=x){
            min++;
        }
        return min-1;
    }

    public static void main(String[] args) {
        int x = 2;
        NC32 nc32 = new NC32();
        System.out.println(nc32.sqrt(x));
    }
}
