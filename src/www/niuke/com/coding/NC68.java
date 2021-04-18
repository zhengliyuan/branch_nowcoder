package www.niuke.com.coding;

/**
 * @author liyuan zheng
 * @date 2020/12/13 20:38
 * 跳台阶
 */
public class NC68 {
    public int JumpFloor(int target) {
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        if(target == 3){
            return 3;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}
