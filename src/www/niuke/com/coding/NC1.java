package www.niuke.com.coding;

import java.util.Stack;

/**
 * @author liyuan zheng
 * @date 2020/12/5 18:50
 * 大数相加
 */
public class NC1 {

    public static void main(String[] args) {
        String str1 = "1111111111";
        String str2 = "99999999999999";
        NC1 nc1 = new NC1();
        System.out.println(nc1.solve(str1,str2));
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public String solve (String s, String t) {
        // write code here
        Stack<Integer> stack = new Stack<>();
        if(s.length()==0){
            return t;
        }
        if(t.length()==0){
            return s;
        }
        StringBuffer resultStr = new StringBuffer();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int number = s.length()<=t.length()?s.length():t.length();
        //记录相加大于10的十位数字
        int temp = 0;
        int flag = 0;
        while (flag<number){
            Integer sTemp = Integer.parseInt(String.valueOf(sChars[sChars.length-flag-1]));
            Integer tTemp = Integer.parseInt(String.valueOf(tChars[tChars.length-flag-1]));
            int sum = sTemp + tTemp + temp;
            if(sum>=10){
                temp = 1;
                sum -= 10;
            }else{
                temp = 0;
            }
            stack.push(sum);
            flag++;
        }
        //循环还未结束的数组
        if(sChars.length>flag){
            for(int i=flag-1;i>=0;i--){
                Integer lastTemp = Integer.parseInt(String.valueOf(sChars[i]));
                int sum = lastTemp + temp;
                if(sum>=10){
                    temp = 1;
                    sum -= 10;
                }else{
                    temp = 0;
                }
                stack.push(sum);
            }
        }
        if(tChars.length>flag){
            for(int i=flag-1;i>=0;i--){
                Integer lastTemp = Integer.parseInt(String.valueOf(tChars[i]));
                int sum = lastTemp + temp;
                if(sum>=10){
                    temp = 1;
                    sum -= 10;
                }else{
                    temp = 0;
                }
                stack.push(sum);
            }
        }
        if(temp!=0){
            stack.push(temp);
        }
        while (!stack.isEmpty()){
            resultStr.append(stack.pop());
        }
        return resultStr.toString();
    }
}
