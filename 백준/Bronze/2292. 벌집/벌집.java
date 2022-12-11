import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;

        if(n == 1){
            System.out.println(1);
        }else{
            while(true) {

                if(solution(i) < n && n <= solution(i+1) ){
                    break;
                }
                i++;
            }

            System.out.println(i+1);
        }
    }

    public static int solution(int a){
        int n = a;
        int sum = 1;

        for(int i = 0; i < n; i++){

            sum = sum + 6*i;
        }
        return  sum;
    }

}
