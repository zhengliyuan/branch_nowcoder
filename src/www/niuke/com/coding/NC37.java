package www.niuke.com.coding;

import www.niuke.com.base.Interval;
import www.niuke.com.base.Interval37;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 给出一组区间，请合并所有重叠的区间。
 * 请保证合并后的区间按区间起点升序排列。
 */
public class NC37 {
    public ArrayList<Interval37> merge(ArrayList<Interval37> intervals) {

        return intervals;
    }

    public static void main(String[] args) {
        NC37 nc37 = new NC37();
        ArrayList<Interval37> list = new ArrayList<>();
        Interval37 interval37 = new Interval37(10,30);
        Interval37 interval371 = new Interval37(20,60);
        Interval37 interval372 = new Interval37(80,100);
        Interval37 interval373 = new Interval37(150,180);
        list.add(interval37);
        list.add(interval371);
        list.add(interval372);
        list.add(interval373);
        nc37.merge(list);
    }
}
