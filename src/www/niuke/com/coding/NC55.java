package www.niuke.com.coding;

public class NC55 {
    public String longestCommonPrefix (String[] strs) {
        // write code here
        String res = "";
        if(strs.length == 0 || strs.length == 0){
            return res;
        }
        StringBuffer str = new StringBuffer();
        for(int i=0;i<strs[0].length();i++){
            char ch = strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].length()<=i || ch != strs[j].charAt(i)){
                    return str.length() == 0?"":str.toString();
                }
            }
            str.append(ch);
        }
        return str.toString();
    }
}
