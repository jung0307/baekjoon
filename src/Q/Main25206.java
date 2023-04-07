package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main25206 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sumA = 0;
        double sumB = 0;

        for(int i = 0; i < 20; i++) {
            String s[] = br.readLine().split(" ");
            double n = Double.parseDouble(s[1]);
            double m = 0;

//            A+	4.5
//            A0	4.0
//            B+	3.5
//            B0	3.0
//            C+	2.5
//            C0	2.0
//            D+	1.5
//            D0	1.0
//            F	0.0

            switch (s[2]) {
                case "A+" : m = 4.5;
                break;
                case "A0" : m = 4.0;
                break;
                case "B+" : m = 3.5;
                break;
                case "B0" : m = 3.0;
                break;
                case "C+" : m = 2.5;
                break;
                case "C0" : m = 2.0;
                break;
                case "D+" : m = 1.5;
                break;
                case "D0" : m = 1.0;
                break;
                case "F" : m = 0.0;
                break;
                case "P" : m = 0; n = 0;
                break;
            }

            sumB = sumB + n*m;
            sumA = sumA + n;

        }

        System.out.println( String.format("%.6f" , sumB / sumA));

    }
}
