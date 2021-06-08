package www.niuke.com.coding;

import www.niuke.com.base.TreeNode;

import java.util.*;

/**
 * 给定一个字符串数组，再给定整数k，请返回出现次数前k名的字符串和对应的次数。
 * 返回的答案应该按字符串出现频率由高到低排序。如果不同的字符串有相同出现频率，按字典序排序。
 * 对于两个字符串，大小关系取决于两个字符串从左到右第一个不同字符的 ASCII 值的大小关系。
 * 比如"ah1x"小于"ahb"，"231"<”32“
 * 字符仅包含数字和字母
 */
public class NC97 {
    public String[][] topKstrings (String[] strings, int k) {
        // write code here
        if(k==0){
            return new String[][]{};
        }
        String[][] res = new String[k][2];
        TreeMap<String,Integer> tmap = new TreeMap<>();
        for(int i=0;i<strings.length;i++){
            String s = strings[i];
            if(!tmap.containsKey(s)){
                tmap.put(s,1);
            }else{
                tmap.put(s,tmap.get(s)+1);
            }
        }
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(tmap.entrySet());
        Collections.sort(list,
                (o1,o2)->(o1.getValue().compareTo(o2.getValue()) == 0?o1.getKey().compareTo(o2.getKey()):o2.getValue().compareTo(o1.getValue())));
        for (int i=0;i<k;i++){
            res[i][0] = list.get(i).getKey();
            res[i][1] = String.valueOf(list.get(i).getValue());
        }
        return res;
    }

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
    }
}
