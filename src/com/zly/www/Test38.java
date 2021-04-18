package com.zly.www;

/**
 * @author liyuan zheng
 * @date 2020/10/11 23:09
 */
public class Test38 {
    public static void main(String[] args) {
        Test38 test38=new Test38();
        test38.countAndSay(5);
    }
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        if(n==2){
            return "11";
        }
        String s="11";
        int i=3;
        while(i<=n){
            StringBuffer str = new StringBuffer();
            int begin=0;
            String[] temp = s.split("");
            int flag=1;
            for(int end=1;end<temp.length;end++){
                if(!temp[end].equals(temp[begin])){
                    str.append(flag);
                    str.append(temp[begin]);
                    begin=end;
                    flag=1;
                }else{
                    flag++;
                }
            }
            s = str.toString();
            i++;
        }
        System.out.println(s);
        return s;
    }
}
