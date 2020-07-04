class A {
    public static void main(String[] args){
    People people;
    people=new People();
    people.height=170;
    people.ear="big ear";
    System.out.println("height:"+people.height);
    System.out.println(people.ear);
    people.speak("what to speak.");
    }
}

public class People{
    int height;
    String ear;
    void speak(String s){
        System.out.println(s);
    }
}