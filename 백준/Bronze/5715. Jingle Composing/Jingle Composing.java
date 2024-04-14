import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = "";

        StringBuilder sb = new StringBuilder();

        while ( !(a = br.readLine()).equals("*") ) {
            String s[] = a.split("/");
            int Sum = 0;


            for(int i = 0; i < s.length; i++) {
                String b[] = s[i].split("");

                double sum = 0;

                for(int j = 0; j < b.length; j++) {

                    if(b[j].equals("W")) {
                        sum = sum + 1;
                    }
                    else if (b[j].equals("H")) {
                        sum = sum + (double)1/2;
                    }
                    else if (b[j].equals("Q")) {
                        sum = sum + (double)1/4;
                    }
                    else if (b[j].equals("E")) {
                        sum = sum + (double)1/8;
                    }
                    else if (b[j].equals("S")) {
                        sum = sum + (double)1/16;
                    }
                    else if (b[j].equals("T")) {
                        sum = sum + (double)1/32;
                    }
                    else if (b[j].equals("X")) {
                        sum = sum + (double)1/64;
                    }


                }

                if(sum == 1) {
                    Sum = Sum + (int)sum;
                }

            }

            sb.append(Sum + "\n");

        }


        System.out.print(sb.toString());

    }
}
