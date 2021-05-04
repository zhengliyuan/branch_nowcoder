package www.niuke.com.coding;

import java.util.Arrays;

/**
 * 在有五张扑克牌，我们需要来判断一下是不是顺子。
 * 有如下规则：
 * A为1,J为11,Q为12,K为13
 * 数据中的0可以看作任意牌
 * 如果给出的五张牌能组成顺子（即这五张牌是连续的）就输出true，否则就输出false。
 * 例如：给出数据[6,0,2,0,4]
 * 中间的两个0一个看作3，一个看作5 。即：[6,3,2,5,4]
 * 这样这五张牌在[2,6]区间连续，输出true
 * 数据保证每组5个数字，每组最多含有4个零
 */
public class NC63 {
    public boolean IsContinuous(int [] numbers) {
        if(numbers.length==0 || numbers.length != 5){
            return false;
        }
        Arrays.sort(numbers);
        int flag = 0;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i] == 0){
                flag++;
            }else if(numbers[i] == numbers[i+1]){
                return false;
            }
        }
        return numbers[4] - numbers[flag] <= 4;

    }

    public static void main(String[] args) {
        int[] a = new int[]{6,0,1,0,4};
        NC63 nc63 = new NC63();
        Boolean aaa = nc63.IsContinuous(a);
        System.out.println(aaa);
    }
}
