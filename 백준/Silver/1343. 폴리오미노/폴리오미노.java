
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        ArrayList<String> s1 = new ArrayList<>();

        int i = 0;
        boolean tf = false;

        while (i <= s.length-1) {

            int count = 0;

            if(s[i].equals(".")){

                s1.add(".");
                i++;

            }else {

                if(s.length != 1){
                    while (s[i].equals("X")) {
                        count++;
                        i++;

                        if(i == s.length) {
                            break;
                        }
                        else if(i == s.length -1 && s[i].equals("X")) {
                            i++;
                            count++;
                            break;
                        }else if(s[i].equals(".")) {
                            break;
                        }

                    }
                }else{
                    count++;
                }

                        if(count%2 != 0) {

                            tf = true;
                            break;

                        }else {

                            int a = count / 4;
                            int b = count % 4;

                            if(a == 0) {
                                for(int k = 0; k < b; k++) {
                                    s1.add("B");
                                }
                            }else {
                                for(int k = 0; k < a; k++){
                                    s1.add("AAAA");
                                }
                                for(int k = 0; k < b; k++) {
                                    s1.add("B");
                                }

                            }

                        }


            }
        }

        StringBuilder sb = new StringBuilder();

        if(tf == true) {
            System.out.println("-1");
        }else {

            for(String k : s1) {
                sb.append(k);
            }

            System.out.println(sb.toString());

        }

    }
}
