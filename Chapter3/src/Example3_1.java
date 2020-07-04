/**
 * @author : Nina
 * @time : 2020/7/4 14:20
 * @description : 位运算加密报文
 */
public class Example3_1 {
    public static void main(String[] args) {
        char a1='十',a2='时',a3='进',a4='攻';
        char secret='b';
        a1=(char)(a1^secret);
        a2=(char)(a2^secret);
        a3=(char)(a3^secret);
        a4=(char)(a4^secret);
        System.out.println("密文："+a1+a2+a3+a4);
        a1=(char)(a1^secret);
        a2=(char)(a2^secret);
        a3=(char)(a3^secret);
        a4=(char)(a4^secret);
        System.out.println("明文："+a1+a2+a3+a4);
    }
}
