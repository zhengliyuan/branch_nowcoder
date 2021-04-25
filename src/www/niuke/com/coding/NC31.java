package www.niuke.com.coding;

import java.net.StandardSocketOptions;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符
 * ,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 */
public class NC31 {
    public int FirstNotRepeatingChar(String str) {
        if(str.length() ==0){
            return -1;
        }
        int res = 0;
        char[] tempChar = str.toCharArray();
        for(int i=0;i<tempChar.length;i++){
            int flag = 0;
            char temp = tempChar[i];
            for(int j =0;j<tempChar.length;j++){
                if(tempChar[j] == temp){
                    flag++;
                }
            }
            if(flag == 1){
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String a = "aaaab";
        NC31 nc31 = new NC31();
        nc31.FirstNotRepeatingChar(a);
        System.out.println(nc31.FirstNotRepeatingChar(a));
    }
}
