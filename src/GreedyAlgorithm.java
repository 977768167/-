import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*贪心算法，一种找局部最优解的算法，整体并不一定是最优解，故名贪心算法，这里用经典的换零钱题目
 *来做解释。
 *
 *
 */
public class GreedyAlgorithm {

    public static int[] money={100,50,20,10,5,1};
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int wholeMoney=scanner.nextInt();
        int[] result=changeMoney(wholeMoney);

        for (int i=0;i<result.length;i++){
            if (result[i]!=0)
            System.out.println(money[i]+" "+result[i]);
        }
    }

    public static int[] changeMoney(int wholeMoney){
        int[] numOfNumber=new int[6];
        for(int i=0;i<money.length-1;i++){
            numOfNumber[i]=wholeMoney/money[i];
            wholeMoney=wholeMoney%money[i];
        }
        numOfNumber[money.length-1]=wholeMoney;
        return numOfNumber;
    }
}
