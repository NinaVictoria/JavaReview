package Example7_2;

/**
 * @author : Nina
 * @time : 2020/7/5 10:50
 * @description : Anonymous class
 */
public class Example7_2 {
    public static void main(String[] args) {
        ShowBoard showBoard = new ShowBoard();
        showBoard.showMessage(new OutputEnglish());
        showBoard.showMessage(new OutputAlphabet() {
            @Override
            public void output() {
                for (char c = 'α'; c <= 'ω'; c++) {
                    System.out.printf("%4c", c);
                }
                System.out.println(" ");
            }
        });
    }

}
