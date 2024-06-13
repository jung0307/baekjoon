import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        StringBuilder sb = new StringBuilder();

        ArrayList<String> arr = new ArrayList<>();

        int a = s.length % 3;
        String b = "";
        String c = "";

        if(a == 1) {
            arr.add("0");
            arr.add("0");
        } else if (a == 2) {
            arr.add("0");
        }

        for(int i = 0; i < s.length; i++) {
            arr.add(s[i]);
        }


        for(int i = 0; i < arr.size(); i++) {

            b =  b + arr.get(i);

            if(b.length() == 3) {
                if(b.equals("000")) {
                    c = "0";
                } else if (b.equals("001")) {
                    c = "1";
                } else if (b.equals("010")) {
                    c = "2";
                } else if (b.equals("011")) {
                    c = "3";
                } else if (b.equals("100")) {
                    c = "4";
                } else if (b.equals("101")) {
                    c = "5";
                } else if (b.equals("110")) {
                    c = "6";
                } else if (b.equals("111")) {
                    c = "7";
                }

                sb.append(c);

                b = "";
                c = "";
            }
        }

        sb.append("\n");

        System.out.print(sb.toString());

    }
}
