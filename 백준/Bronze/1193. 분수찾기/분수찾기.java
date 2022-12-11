import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

      //  System.out.println(solution(n));

        while (true){

            if(solution(count) +1 <= n && n <= solution(count+1)){
//                System.out.println("solution(count) : "+(solution(count)+1));
//                System.out.println("solution(count+1) : "+solution(count+1));
                break;
            }
            count++;
        }
//        System.out.println("count+1 : "+(count+1));

        int a1 = 1;
        int a2 = 1;

        // a1 + a2 = count+2
        // a1  = count+2-a2
        if((count+1)%2 == 0){
             a1 = n - (solution(count)+1) + 1;
             a2 = count+2-a1;
        }else{
             a1 = count + 2 - (1 + (n - (solution(count) + 1)));
             a2 = 1 + (n - (solution(count) + 1));
        }

        System.out.println(a1+"/"+a2);
    }

    public static int solution(int a){
        int n = a;
        int sum = 0;
        int count = 0;

        for(int i = 0; i < n; i++){

            count = 0;
            for(int j = 0; j <= i; j++){
                count++;
            }
            sum = sum + count;
        }
        return  sum;
    }

}
