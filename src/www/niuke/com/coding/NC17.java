package www.niuke.com.coding;
import java.util.*;

public class NC17 {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        if(n<2){
            return A.length();
        }
        int maxLen = 1;
        boolean[][] dp = new boolean[n][n];
        for(int right = 1;right<n;right++){
            for(int left=0;left<right;left++){
                if(A.charAt(right) != A.charAt(left)){
                    continue;
                }
                if(right == left){
                    dp[left][right] = true;
                }else if(right-left<=2){
                    dp[left][right] = true;
                }else{
                    dp[left][right] = dp[left+1][right-1];
                }
                if(dp[left][right] && right-left+1>maxLen){
                    maxLen = right-left+1;
                }
            }
        }
        return maxLen;
    }


    public static void main(String[] args) {
        String a = "abc1234321ab";
        int num = 12;
        NC17 nc17 = new NC17();
        System.out.println(nc17.getLongestPalindrome(a,12));
    }
}
