
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        int arr[] = new int[26];

//        System.out.println((int)'A');
//        System.out.println((int)'Z');

        for(int i = 0; i < s.length; i++) {
            char a = s[i].charAt(0);
            arr[(int)a - 'A'] = arr[(int)a - 'A'] + 1;
        }

        int count1 = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] %2 != 0) {
                count1++;
            }
        }
        if(count1 > 1) {
            System.out.println("I'm Sorry Hansoo");
        }else{

            //System.out.println("기모띠");
            //        for(int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

            char[] arr2 = new char[s.length];

            int l = 0;
            for(int i = 0; i < arr.length; i++) {

                if(arr[i] > 0 && arr[i] %2 == 0) {

                    for(int j = 0; j < arr[i]/2; j++) {
                        arr2[l] = (char)(i+65);
                        arr2[arr2.length - 1 - l] = (char)(i+65);
                        //System.out.println("W"+(char)(i+65));
                        l++;
                    }

                }else if(arr[i] > 0 && arr[i] %2 != 0) {
                    for(int j = 0; j < arr[i]/2; j++) {
                        arr2[l] = (char)(i+65);
                        arr2[arr2.length - 1 - l] = (char)(i+65);
                        l++;
                    }
                    arr2[arr2.length/2] = (char)(i+65);
                    //System.out.println("W2"+(char)(i+65));

                }

            }

            for(char b : arr2) {
                System.out.print(b);
            }
            System.out.println();

        }

    }
}
