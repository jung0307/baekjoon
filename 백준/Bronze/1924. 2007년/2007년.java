
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        // SUN, MON, TUE, WED, THU, FRI, SAT

        // 1월 1일 MON 1월 31일 WEN
        // 2월 1일 THU 2월 28일 WED
        // 3월 1일 THU 3월 31일 SAT
        // 4월 1일 SUN 4월 30일 MON
        // 5월 1일 TUE 5월 31일 THU
        // 6월 1일 FRI 6월 30일 SAT
        // 7월 1일 SUN 7월 31일 TUE
        // 8월 1일 WED 8월 31일 FRI
        // 9월 1일 SAT 9월 30일 SUN
        // 10월 1일 MON 10월 31일 WED
        // 11월 1일 THU 11월 30일 FRI
        // 12월 1일 SAT 12월 31일 MON

        int a = m%7;;

        if(n == 1) {
            switch (a) {
                case 0 : System.out.println("SUN");
                break;
                case 1 : System.out.println("MON");
                break;
                case 2 : System.out.println("TUE");
                break;
                case 3 : System.out.println("WED");
                break;
                case 4 : System.out.println("THU");
                break;
                case 5 : System.out.println("FRI");
                break;
                case 6 : System.out.println("SAT");
                break;
            }
        }
        else if(n == 2) {
            switch (a) {
                case 0 : System.out.println("WED");
                    break;
                case 1 : System.out.println("THU");
                    break;
                case 2 : System.out.println("FRI");
                    break;
                case 3 : System.out.println("SAT");
                    break;
                case 4 : System.out.println("SUN");
                    break;
                case 5 : System.out.println("MON");
                    break;
                case 6 : System.out.println("TUE");
                    break;
            }
        }
        else if(n == 3) {
            switch (a) {
                case 0 : System.out.println("WED");
                    break;
                case 1 : System.out.println("THU");
                    break;
                case 2 : System.out.println("FRI");
                    break;
                case 3 : System.out.println("SAT");
                    break;
                case 4 : System.out.println("SUN");
                    break;
                case 5 : System.out.println("MON");
                    break;
                case 6 : System.out.println("TUE");
                    break;
            }
        }
        else if(n == 4) {
            switch (a) {
                case 0 : System.out.println("SAT");
                    break;
                case 1 : System.out.println("SUN");
                    break;
                case 2 : System.out.println("MON");
                    break;
                case 3 : System.out.println("TUE");
                    break;
                case 4 : System.out.println("WED");
                    break;
                case 5 : System.out.println("THU");
                    break;
                case 6 : System.out.println("FRI");
                    break;
            }
        }
        else if(n == 5) {
            switch (a) {
                case 0 : System.out.println("MON");
                    break;
                case 1 : System.out.println("TUE");
                    break;
                case 2 : System.out.println("WED");
                    break;
                case 3 : System.out.println("THU");
                    break;
                case 4 : System.out.println("FRI");
                    break;
                case 5 : System.out.println("SAT");
                    break;
                case 6 : System.out.println("SUN");
                    break;
            }
        }
        else if(n == 6) {
            switch (a) {
                case 0 : System.out.println("THU");
                    break;
                case 1 : System.out.println("FRI");
                    break;
                case 2 : System.out.println("SAT");
                    break;
                case 3 : System.out.println("SUN");
                    break;
                case 4 : System.out.println("MON");
                    break;
                case 5 : System.out.println("TUE");
                    break;
                case 6 : System.out.println("WED");
                    break;
            }
        }
        else if(n == 7) {
            switch (a) {
                case 0 : System.out.println("SAT");
                    break;
                case 1 : System.out.println("SUN");
                    break;
                case 2 : System.out.println("MON");
                    break;
                case 3 : System.out.println("TUE");
                    break;
                case 4 : System.out.println("WED");
                    break;
                case 5 : System.out.println("THU");
                    break;
                case 6 : System.out.println("FRI");
                    break;
            }
        }
        else if(n == 8) {
            switch (a) {
                case 0 : System.out.println("TUE");
                    break;
                case 1 : System.out.println("WED");
                    break;
                case 2 : System.out.println("THU");
                    break;
                case 3 : System.out.println("FRI");
                    break;
                case 4 : System.out.println("SAT");
                    break;
                case 5 : System.out.println("SUN");
                    break;
                case 6 : System.out.println("MON");
                    break;
            }
        }
        else if(n == 9) {
            switch (a) {
                case 0 : System.out.println("FRI");
                    break;
                case 1 : System.out.println("SAT");
                    break;
                case 2 : System.out.println("SUN");
                    break;
                case 3 : System.out.println("MON");
                    break;
                case 4 : System.out.println("TUE");
                    break;
                case 5 : System.out.println("WED");
                    break;
                case 6 : System.out.println("THU");
                    break;
            }
        }
        else if(n == 10) {
            switch (a) {
                case 0 : System.out.println("SUN");
                    break;
                case 1 : System.out.println("MON");
                    break;
                case 2 : System.out.println("TUE");
                    break;
                case 3 : System.out.println("WED");
                    break;
                case 4 : System.out.println("THU");
                    break;
                case 5 : System.out.println("FRI");
                    break;
                case 6 : System.out.println("SAT");
                    break;
            }
        }
        else if(n == 11) {
            switch (a) {
                case 0 : System.out.println("WED");
                    break;
                case 1 : System.out.println("THU");
                    break;
                case 2 : System.out.println("FRI");
                    break;
                case 3 : System.out.println("SAT");
                    break;
                case 4 : System.out.println("SUN");
                    break;
                case 5 : System.out.println("MON");
                    break;
                case 6 : System.out.println("TUE");
                    break;
            }
        }
        else if(n == 12) {
            switch (a) {
                case 0 : System.out.println("FRI");
                    break;
                case 1 : System.out.println("SAT");
                    break;
                case 2 : System.out.println("SUN");
                    break;
                case 3 : System.out.println("MON");
                    break;
                case 4 : System.out.println("TUE");
                    break;
                case 5 : System.out.println("WED");
                    break;
                case 6 : System.out.println("THU");
                    break;
            }
        }


    }
}
