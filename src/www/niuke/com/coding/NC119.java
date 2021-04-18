package www.niuke.com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author liyuan zheng
 * @date 2020/12/13 16:41
 * 最小的K个数
 */
public class NC119 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input.length == 0 || input.length < k){
            return list;
        }
        Arrays.sort(input);
        for(int i=0;i<k&&i<input.length;i++){
            list.add(input[i]);
        }
        return list;
    }
}
