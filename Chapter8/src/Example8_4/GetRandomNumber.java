package Example8_4;

import java.util.Random;

/**
 * @author : Nina
 * @time : 2020/7/5 22:34
 * @description :
 */
public class GetRandomNumber {
    public static int [] getRandomNumber(int max,int amount){
        //1 to max
        int [] randomNumber = new int[amount];
        int index=0;
        randomNumber[0]=-1;
        Random random=new Random();
        while (index<amount){
            int number=random.nextInt(max)+1;
            boolean isInArrays=false;
            for(int m:randomNumber){
                if(m==number)
                    isInArrays=true;
            }
            if(isInArrays==false){
                randomNumber[index]=number;
                index++;
            }
        }
        return randomNumber;
    }
}
