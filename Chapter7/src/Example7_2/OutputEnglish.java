package Example7_2;

/**
 * @author : Nina
 * @time : 2020/7/5 10:52
 * @description :
 */
public class OutputEnglish extends OutputAlphabet {
    @Override
    public void output() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.printf("%4c", c);
        }
        System.out.println(" ");
    }
}
