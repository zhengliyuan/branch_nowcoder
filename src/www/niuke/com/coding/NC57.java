package www.niuke.com.coding;

/**
 * 将给出的32位整数x翻转。
 * 例1:x=123，返回321
 * 例2:x=-123，返回-321
 *
 * 你有注意到翻转后的整数可能溢出吗？因为给出的是32位整数，翻转可能会导致溢出，如果反转后的结果会溢出就返回 0。
 */
public class NC57 {
    public int reverse (int x) {
        // write code here
        long reverse = 0;
        while (x != 0){
            int last = x%10;
            reverse = reverse*10 + last;
            if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
                return 0;
            }
            x = x/10;
        }
        return (int)reverse;
    }
}
