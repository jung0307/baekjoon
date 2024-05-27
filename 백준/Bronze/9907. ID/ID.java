import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");

//        The weight of the first digit is 2, the weight of the second is 7,
//            the third is 6, the fourth is 5, the fifth is 4, the sixth is 3, and the seventh is 2.

        int sum = 0;

        for(int i = 0; i < s.length; i++) {
            if(i == 0) {
                sum = sum + (2 * Integer.parseInt(s[i]));
            } else if (i == 1) {
                sum = sum + (7 * Integer.parseInt(s[i]));
            } else if (i == 2) {
                sum = sum + (6 * Integer.parseInt(s[i]));
            } else if (i == 3) {
                sum = sum + (5 * Integer.parseInt(s[i]));
            } else if (i == 4) {
                sum = sum + (4 * Integer.parseInt(s[i]));
            } else if (i == 5) {
                sum = sum + (3 * Integer.parseInt(s[i]));
            } else if (i == 6) {
                sum = sum + (2 * Integer.parseInt(s[i]));
            }
        }

//        0=J, 1=A, 2=B, 3=C, 4=D, 5=E, 6=F, 7=G, 8=H, 9=I, 10=Z.

        if(sum % 11 == 0) {
            System.out.println("J");
        }
        else if (sum % 11 == 1) {
            System.out.println("A");

        }
        else if (sum % 11 == 2) {
            System.out.println("B");

        }
        else if (sum % 11 == 3) {
            System.out.println("C");

        }
        else if (sum % 11 == 4) {
            System.out.println("D");

        }
        else if (sum % 11 == 5) {
            System.out.println("E");

        }
        else if (sum % 11 == 6) {
            System.out.println("F");

        }
        else if (sum % 11 == 7) {
            System.out.println("G");

        }
        else if (sum % 11 == 8) {
            System.out.println("H");

        }
        else if (sum % 11 == 9) {
            System.out.println("I");

        }
        else if (sum % 11 == 10) {
            System.out.println("Z");

        }



    }
}
