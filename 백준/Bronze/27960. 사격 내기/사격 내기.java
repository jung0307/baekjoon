import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int z = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = 0 ;

        int arrA[] = new int[10];
        int arrB[] = new int[10];

        method1(a);

        while (z >= 0) {

            if(a >= (int)Math.pow(2 , z)) {
                a = a - (int)Math.pow(2 , z);
                arrA[z]++;
            }
            z--;
        }

        method1(b);
        
        while (z >= 0) {
            if(b >= (int)Math.pow(2 , z)) {
                b = b - (int)Math.pow(2 , z);
                arrB[z]++;
            }
            z--;
        }

        for(int i = 0; i < 10; i++) {
            if(arrA[i] == 0 && arrB[i] == 1) {
                c = c + (int)Math.pow(2 , i);
            } else if (arrA[i] == 1 && arrB[i] == 0) {
                c = c + (int)Math.pow(2 , i);
            }
        }


        System.out.println(c);


    }

    static void method1(int score) {

        if(score > 512) {
            z = 9;
        } else if (score > 256) {
            z = 8;
        } else if (score > 128) {
            z = 7;
        } else if (score > 64) {
            z = 6;
        }
        else if (score > 32) {
            z = 5;
        }
        else if (score > 16) {
            z = 4;
        }
        else if (score > 8) {
            z = 3;
        }
        else if (score > 4) {
            z = 2;
        }
        else if (score > 2) {
            z = 1;
        }else if(score >= 1) {
            z = 0;
        }

    }
}
