
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = 0;

            if(s[0].length() > 1) {
                String ss[] = s[0].split("");
                a = Integer.parseInt(ss[ss.length-1]);
            }else {
                a = Integer.parseInt(s[0]);
            }

            int b = Integer.parseInt(s[1]);

            switch (a) {
                case 0 : sb.append("10\n");
                break;
                case 1 : sb.append("1\n");
                break;
                case 2 :
                    if(b%4 == 0) {
                        sb.append("6\n");
                    }else if(b%4 == 1) {
                        sb.append("2\n");
                    }else if(b%4 == 2) {
                        sb.append("4\n");
                    }else if(b%4 == 3) {
                        sb.append("8\n");
                    }
                break;
                case 3 :
                    if(b%4 == 0) {
                        sb.append("1\n");
                    }else if(b%4 == 1) {
                        sb.append("3\n");
                    }else if(b%4 == 2) {
                        sb.append("9\n");
                    }else if(b%4 == 3) {
                        sb.append("7\n");
                    }
                break;
                case 4 :
                    if(b%2 == 0) {
                        sb.append("6\n");
                    }else if(b%2 == 1) {
                        sb.append("4\n");
                    }
                break;
                case 5 : sb.append("5\n");
                break;
                case 6 : sb.append("6\n");
                break;
                case 7 :
                    if(b%4 == 0) {
                        sb.append("1\n");
                    }else if(b%4 == 1) {
                        sb.append("7\n");
                    }else if(b%4 == 2) {
                        sb.append("9\n");
                    }else if(b%4 == 3) {
                        sb.append("3\n");
                    }
                break;
                case 8 :
                    if(b%4 == 0) {
                        sb.append("6\n");
                    }else if(b%4 == 1) {
                        sb.append("8\n");
                    }else if(b%4 == 2) {
                        sb.append("4\n");
                    }else if(b%4 == 3) {
                        sb.append("2\n");
                    }
                break;
                case 9 :
                    if(b%2 == 0) {
                        sb.append("1\n");
                    }else if(b%2 == 1) {
                        sb.append("9\n");
                    }
                break;
            }


        }

        System.out.print(sb.toString());

    }
}
