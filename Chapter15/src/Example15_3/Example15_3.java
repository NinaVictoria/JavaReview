package Example15_3;

import java.util.TreeSet;

/**
 * @author : Nina
 * @time : 2020/7/7 20:53
 * @description : TreeSet  TreeMAp
 */
public class Example15_3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("boy");
        treeSet.add("apple");
        treeSet.add("zero");
        treeSet.add("girl");
        treeSet.add("world");
        treeSet.add("java");
        //下层的比上层的大，不允许出现大小相等的节点
        System.out.println(treeSet.first());    //最小的
        System.out.println(treeSet.last());     //最大的
        /*
          TreeMap相当于排序的映射表
         */
    }
}
