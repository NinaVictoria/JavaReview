package Example15_1;

import java.util.*;

/**
 * @author : Nina
 * @time : 2020/7/7 20:14
 * @description : Generics ，List
 */
public class Example15_1 {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<Student>();
        list.add(new Student(170, "Tom"));
        list.add(new Student(176, "Jack"));
        list.add(new Student(175, "Nina"));
        list.add(new Student(165, "Kate"));

        Iterator<Student> iterator = list.iterator(); //返回该链表的迭代器
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.name + ",身高:" + student.height + "cm.");
        }

        Collections.shuffle(list);  //随机排列
        System.out.println("随机排列后:");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.name + ",身高:" + student.height + "cm.");
        }

        Collections.rotate(list, 2); //向右转动2个元素
        System.out.println("转动后:");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.name + ",身高:" + student.height + "cm.");
        }

        Collections.sort(list);     //根据Comparable接口来升序排序的，所以Student类需要实现Comparable接口
        System.out.println("排序后:");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.name + ",身高:" + student.height + "cm.");
        }

        Collections.reverse(list);
        System.out.println("翻转后:");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.name + ",身高:" + student.height + "cm.");
        }

        //也是根据Comparable接口进行二分查找，返回index
        Student Kelly = new Student(175, "Kelly");
        int index = Collections.binarySearch(list, Kelly, null);
        if (index >= 0) {
            System.out.println("链表中的" + list.get(index).name + "和" + Kelly.name + "身高相同");
        } else {
            System.out.println("链表中没有人和" + Kelly.name + "身高相同");
        }
    }
}
