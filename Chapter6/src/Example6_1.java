/**
 * @author : Nina
 * @time : 2020/7/5 10:10
 * @description : interface
 */
public class Example6_1 {
    public static void main(String[] args) {
        ShowMessage showMessage1=new TV();
        showMessage1.showMyMessage();

        ShowMessage showMessage2=new PC();
        showMessage2.showMyMessage();
    }
}

interface ShowMessage {
    void showMyMessage();
}

class TV implements ShowMessage{

    @Override
    public void showMyMessage() {
        System.out.println("This is a TV");
    }
}

class PC implements ShowMessage{
    @Override
    public void showMyMessage() {
        System.out.println("This is a PC");
    }
}