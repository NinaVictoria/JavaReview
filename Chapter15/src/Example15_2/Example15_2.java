package Example15_2;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author : Nina
 * @time : 2020/7/7 20:38
 * @description : Map
 */
public class Example15_2 {
    public static void main(String[] args) {
        Map<String,Student> hashMap=new HashMap<String, Student>();
        hashMap.put("1001",new Student(175,"Nina"));
        hashMap.clear();//清空散列映射
        System.out.println("当前映射是否为空："+hashMap.isEmpty());
        hashMap.put("1001",new Student(175,"Nina"));
        hashMap.put("1002",new Student(172,"Tom"));
        hashMap.put("1003",new Student(170,"Jack"));
        System.out.println("当前映射中共有"+hashMap.size()+"项");
        System.out.println("当前映射中是否有学号为1002的学生："+hashMap.containsKey("1002"));
        System.out.println("当前映射中是否有身高165，名字为Kate的学生："+hashMap.containsValue(new Student(165,"Kate")));

        //使用Iterator遍历
        Iterator iterator=hashMap.values().iterator();
        while (iterator.hasNext()){
            Student student=(Student)iterator.next();
            System.out.println(student.name + ",身高:" + student.height + "cm.");
        }
    }
}
