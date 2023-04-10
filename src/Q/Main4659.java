package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4659 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("end")) {
            String ss[] = s.split("");
            int arrInt[] = new int[s.length()];
            boolean tf = false;
            boolean tf2 = false;
            boolean tf3 = false;

            for(int i = 0; i < ss.length; i++) {
                if(ss[i].equals("a") || ss[i].equals("e") || ss[i].equals("i") || ss[i].equals("o") || ss[i].equals("u")) {
                    arrInt[i] = 1;
                    tf = true;
                }else {
                    arrInt[i] = 0;
                }
            }

            for(int i = 0; i < arrInt.length-2; i++) {
                if(arrInt[i] == arrInt[i+1] && arrInt[i+1] == arrInt[i+2]) {
                    tf2 = true;
                }
            }

            for(int i = 0; i < ss.length-1; i++) {
                if(ss[i].equals(ss[i+1])) {
                    if(!(ss[i].equals("e") || ss[i].equals("o"))) {
                        tf3 = true;
                    }
                }
            }

            if (tf == false) {
                sb.append("<"+s+"> is not acceptable.\n");
            }else if(tf2 == true) {
                sb.append("<"+s+"> is not acceptable.\n");
            }else if(tf3 == true) {
                sb.append("<"+s+"> is not acceptable.\n");
            }else {
                sb.append("<"+s+"> is acceptable.\n");
            }
        }

        System.out.print(sb.toString());

    }
}
