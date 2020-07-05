package Example5_1;

/**
 * @author : Nina
 * @time : 2020/7/5 8:43
 * @description : extends
 */
public class Example5_1 {
    public static void main(String[] args) {
        System.out.println("---我是学生---");
        Student studentZhang = new Student();
        studentZhang.age = 17;
        studentZhang.number = 15045214;
        studentZhang.showPeople();
        studentZhang.tellNumber();
        System.out.println("会做加法");
        System.out.println("20+20=" + studentZhang.add(20, 20));
        System.out.println("---我是大学生---");
        UniverStudent univerStudent = new UniverStudent();
        univerStudent.age = 20;
        univerStudent.number = 15045215;
        univerStudent.showPeople();
        univerStudent.tellNumber();
        System.out.println("会做加法");
        System.out.println("20+20=" + univerStudent.add(20, 20));
        System.out.println("会做乘法");
        System.out.println("20*20=" + univerStudent.multi(20, 20));
    }


}
