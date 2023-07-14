import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
//
//        black	0	1
//        brown	1	10
//        red	2	100
//        orange	3	1,000
//        yellow	4	10,000
//        green	5	100,000
//        blue	6	1,000,000
//        violet	7	10,000,000
//        grey	8	100,000,000
//        white	9	1,000,000,000

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        long n = 0;

        for(int i = 0; i < 3; i++) {
            if(i < 2) {

                switch (br.readLine()) {
                    case "black" : s = s + "0";
                    break;
                    case "brown" : s = s + "1";
                    break;
                    case "red" : s = s + "2";
                    break;
                    case "orange" : s = s + "3";
                    break;
                    case "yellow" : s = s + "4";
                    break;
                    case "green" : s = s + "5";
                    break;
                    case "blue" : s = s + "6";
                    break;
                    case "violet" : s = s + "7";
                    break;
                    case "grey" : s = s + "8";
                    break;
                    case "white" : s = s + "9";
                    break;

                }
                
            }else {
                switch (br.readLine()) {
                    case "black" : n = Long.parseLong(s) * 1;
                        break;
                    case "brown" : n = Long.parseLong(s) * 10;
                        break;
                    case "red" : n = Long.parseLong(s) * 100;
                        break;
                    case "orange" : n = Long.parseLong(s) * 1000;
                        break;
                    case "yellow" : n = Long.parseLong(s) * 10000;
                        break;
                    case "green" : n = Long.parseLong(s) * 100000;
                        break;
                    case "blue" : n = Long.parseLong(s)* 1000000;
                        break;
                    case "violet" : n = Long.parseLong(s) * 10000000;
                        break;
                    case "grey" : n = Long.parseLong(s) * 100000000;
                        break;
                    case "white" : n = Long.parseLong(s) * 1000000000;
                        break;
                }
            }
        }

        System.out.println(n);

    }
}
