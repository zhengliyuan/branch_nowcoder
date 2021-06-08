package www.niuke.com.coding;

import java.util.Arrays;

public class NC103 {
    public String solve (String str) {
        // write code here
        if(str == null){
            return str;
        }
        char[] temp = str.toCharArray();
        for(int i=0;i<temp.length/2;i++){
            char tempChar = temp[i];
            temp[i] = temp[temp.length-i-1];
            temp[temp.length-i-1] = tempChar;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<temp.length;i++){
            stringBuffer.append(temp[i]);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String a = "abcdefghijklmn";
        NC103 nc103 = new NC103();
        System.out.println(nc103.solve(a));
    }
}
