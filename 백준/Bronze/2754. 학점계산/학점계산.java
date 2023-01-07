import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s1 = "";

//        A+: 4.3, A0: 4.0, A-: 3.7
//
//        B+: 3.3, B0: 3.0, B-: 2.7
//
//        C+: 2.3, C0: 2.0, C-: 1.7
//
//        D+: 1.3, D0: 1.0, D-: 0.7
//
//        F: 0.0

        switch (s) {
            case "A+" : s1 = "4.3";
            break;
            case "A0" : s1 = "4.0";
            break;
            case "A-" : s1 = "3.7";
            break;
            case "B+" : s1 = "3.3";
            break;
            case "B0" : s1 = "3.0";
            break;
            case "B-" : s1 = "2.7";
            break;
            case "C+" : s1 = "2.3";
            break;
            case "C0" : s1 = "2.0";
            break;
            case "C-" : s1 = "1.7";
            break;
            case "D+" : s1 = "1.3";
            break;
            case "D0" : s1 = "1.0";
            break;
            case "D-" : s1 = "0.7";
            break;
            case "F" : s1 = "0.0";
            break;
        }

        System.out.println(s1);

    }
}
