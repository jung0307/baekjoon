

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arrChar[] = new int[26];

        int sum = 0;

        for(int i = 0; i < n; i++) {

            String s = br.readLine();
            String arr[] = s.split("");
            boolean tf = false;
            arrChar = null;
            arrChar = new int[26];

//            System.out.println('a' - 0);

//            System.out.println(arrChar[s.charAt(i) - 0]);

            for(int j = 0; j < arr.length-1; j++) {
                //    System.out.println(arr[j]);
                if(!arr[j].equals(arr[j+1])) {

                    if(arrChar[s.charAt(j) - 97] == 0) {
                        arrChar[s.charAt(j) - 97] = 1;
                    //    System.out.println("어디서1");
                    }else{
                    //    System.out.println("어디서2");
                        tf = true;
                        break;
                    }

                }else{
                 //   System.out.println("어디서3");
                }

                if(j == arr.length-2) {
                //    System.out.println("어디서4");

                    if(arrChar[s.charAt(j+1) - 97] == 1) {
                    //    System.out.println("어디서5");

                        tf = true;
                    }
                }

            }

            if(tf == false) {
                sum++;
            }
        }

        System.out.println(sum);

    }
}
//4
//        aba
//        abab
//        abcabc
//        a