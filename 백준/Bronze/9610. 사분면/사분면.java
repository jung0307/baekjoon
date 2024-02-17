import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int section1 = 0;
        int section2 = 0;
        int section3 = 0;
        int section4 = 0;
        int section5 = 0;

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if(a > 0) {
                if(b > 0) {
                    section1++;
                } else if (b == 0) {
                    section5++;
                }else {
                    section4++;
                }
            }else if(a == 0) {
                section5++;
            }else {
                if(b > 0) {
                    section2++;
                } else if (b == 0) {
                    section5++;
                }else {
                    section3++;
                }
            }
        }

        System.out.println("Q1: " + section1);
        System.out.println("Q2: " + section2);
        System.out.println("Q3: " + section3);
        System.out.println("Q4: " + section4);
        System.out.println("AXIS: " + section5);

    }
}
