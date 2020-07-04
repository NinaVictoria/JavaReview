
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("´ó¼ÒºÃ£¡");
		System.out.println("Nice to meet you!");
		Student stu=new Student();
		stu.speak("We are student");
	}
}
class Student{
	public void speak(String s) {
		System.out.println(s);
	}
}
