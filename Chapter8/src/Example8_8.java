import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : Nina
 * @time : 2020/7/5 23:08
 * @description :
 */
public class Example8_8 {
    public static void main(String[] args) {
        String s="市话12.5元，长途36.8元，短信17.5元";
        String regex="[1234567890.]+";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(s);
        double sum=0;
        while (matcher.find()){
            String item= matcher.group();
            System.out.println(item);
            sum+=Double.parseDouble(item);
        }
        System.out.println("账单总价格"+sum);
    }
}
