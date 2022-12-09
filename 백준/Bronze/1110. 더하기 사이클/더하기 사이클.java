import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String givenNum = sc.nextLine();
        String givenNumReal = givenNum;
        String resultNumStr;
        int rN;
        int lN;
        int cycle = 1;

        String arr[] = new String[2];

        if(Integer.parseInt(givenNum) < 10){
            givenNum =  "0" + givenNum;
        }

        while (true) {
             arr = givenNum.split("");
             rN = Integer.parseInt(arr[1]);
             lN = Integer.parseInt(arr[0]);
             resultNumStr = Integer.toString(rN) + Integer.toString(((rN + lN)%10));

             if(Integer.parseInt(givenNumReal) == Integer.parseInt(resultNumStr)){
                 System.out.println(cycle);
                 break;
             }
             cycle++;
             givenNum = resultNumStr;
        }
    }
}
