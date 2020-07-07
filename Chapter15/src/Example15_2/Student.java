package Example15_2;

/**
 * @author : Nina
 * @time : 2020/7/7 20:15
 * @description :
 */
public class Student implements Comparable {
    int height;
    String name;

    public Student(int height, String name) {
        this.height = height;
        this.name = name;
    }


    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return this.height - student.height;
    }
}
