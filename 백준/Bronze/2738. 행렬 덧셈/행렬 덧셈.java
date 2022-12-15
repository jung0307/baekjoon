
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String arr[] =s.split(" ");
        int a = Integer.parseInt(arr[0]); // n x m 배열 n이 행 m 열
        int b = Integer.parseInt(arr[1]);
        int[][] arrInt = new int[a][b];
        int[][] arrInt2 = new int[a][b];
 //       int[][] arrInt3 = new int[a][b];


        for(int i = 0; i< a; i++){
            s = br.readLine();
            arr = s.split(" ");

                for(int j = 0; j < b; j++){
                    arrInt[i][j] = Integer.parseInt(arr[j]);
                }


        }

        for(int i = 0; i< a; i++){
            s = br.readLine();
            arr = s.split(" ");

            for(int j = 0; j < b; j++){
                arrInt2[i][j] = Integer.parseInt(arr[j]);
            }


        }
//
//        for(int[] w : arrInt){
//            for(int e : w){
//                System.out.println(e);
//            }
//        }
//        for(int[] w : arrInt2){
//            for(int e : w){
//                System.out.println(e);
//            }
//        }
        for(int i = 0; i < arrInt.length; i++){
            for(int j = 0; j<arrInt[i].length; j++){
                 System.out.print(arrInt[i][j] + arrInt2[i][j] + " ");
            }
            System.out.println();
        }




    }

}
