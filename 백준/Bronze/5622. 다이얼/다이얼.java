

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String arr[] = s.split("");
        int[] arrInt = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i].equals("A") || arr[i].equals("B") || arr[i].equals("C")) {
                arrInt[i] = 3;
            }else if(arr[i].equals("D") || arr[i].equals("E") || arr[i].equals("F")) {
                arrInt[i] = 4;
            }else if(arr[i].equals("G") || arr[i].equals("H") || arr[i].equals("I")) {
                arrInt[i] = 5;
            }else if(arr[i].equals("J") || arr[i].equals("K") || arr[i].equals("L")) {
                arrInt[i] = 6;
            }else if(arr[i].equals("M") || arr[i].equals("N") || arr[i].equals("O")) {
                arrInt[i] = 7;
            }else if(arr[i].equals("P") || arr[i].equals("Q") || arr[i].equals("R") || arr[i].equals("S")) {
                arrInt[i] = 8;
            }else if(arr[i].equals("T") || arr[i].equals("U") || arr[i].equals("V")) {
                arrInt[i] = 9;
            }else if(arr[i].equals("W") || arr[i].equals("X") || arr[i].equals("Y") || arr[i].equals("Z")) {
                arrInt[i] = 10;
            }
        }

        for(int a : arrInt) {
            sum = sum + a;
        }

        System.out.println(sum);

    }
}
