import java.io.Console;

/**
 * @author : Nina
 * @time : 2020/7/5 22:57
 * @description : Commonly used class: Console
 */
public class Example8_7 {
    public static void main(String[] args) {
        char[] password;
        Console console=System.console();
        /**
         * 虚拟机是否具有控制台取决于底层平台，还取决与虚拟机的方式，
         * 如果虚拟机从一个交互式命令行开始启动，且没有重定向标准输入
         * 和输出流，那么其控制台将存在，通常连接到键盘并从虚拟机启动
         * 的地方显示。如果虚拟机是自启动的（例如，有后台作业调度程序
         * 启动），那么他通常没有控制台。如果此虚拟机具有控制台，那么
         * 他将由此类唯一的实例。如果没有可用的控制台设备，那么对该方
         * 法的调用将返回null
         *
         * 所以在集成开发环境中例如Eclipse和IDEA，将获取不到控制台。
         */
        if(console!=null){
            System.out.print("请输入密码：");
            password=console.readPassword();
            System.out.println("用户输入的密码为："+password);
        }

    }
}
