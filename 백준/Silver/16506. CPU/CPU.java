import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[16];
        StringBuilder sb = new StringBuilder();

//        System.out.println(bi(n , 3));
//        System.out.println(bi(n , 4));

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            switch (s[0]) {
                case "ADD" :
                    arr[0] = 0;
                    arr[1] = 0;
                    arr[2] = 0;
                    arr[3] = 0;
                    arr[4] = 0;
                break;
                case "ADDC" :
                    arr[0] = 0;
                    arr[1] = 0;
                    arr[2] = 0;
                    arr[3] = 0;
                    arr[4] = 1;
                break;
                case "SUB" :
                    arr[0] = 0;
                    arr[1] = 0;
                    arr[2] = 0;
                    arr[3] = 1;
                    arr[4] = 0;
                break;
                case "SUBC" :
                    arr[0] = 0;
                    arr[1] = 0;
                    arr[2] = 0;
                    arr[3] = 1;
                    arr[4] = 1;
                break;
                case "MOV" :
                    arr[0] = 0;
                    arr[1] = 0;
                    arr[2] = 1;
                    arr[3] = 0;
                    arr[4] = 0;
                break;
                case "MOVC" :
                    arr[0] = 0;
                    arr[1] = 0;
                    arr[2] = 1;
                    arr[3] = 0;
                    arr[4] = 1;
                break;
                case "AND" :
                    arr[0] = 0;
                    arr[1] = 0;
                    arr[2] = 1;
                    arr[3] = 1;
                    arr[4] = 0;
                break;
                case "ANDC" :
                    arr[0] = 0;
                    arr[1] = 0;
                    arr[2] = 1;
                    arr[3] = 1;
                    arr[4] = 1;
                break;
                case "OR" :
                    arr[0] = 0;
                    arr[1] = 1;
                    arr[2] = 0;
                    arr[3] = 0;
                    arr[4] = 0;
                break;
                case "ORC" :
                    arr[0] = 0;
                    arr[1] = 1;
                    arr[2] = 0;
                    arr[3] = 0;
                    arr[4] = 1;
                break;
                case "NOT" :
                    arr[0] = 0;
                    arr[1] = 1;
                    arr[2] = 0;
                    arr[3] = 1;
                    arr[4] = 0;
                break;
                case "MULT" :
                    arr[0] = 0;
                    arr[1] = 1;
                    arr[2] = 1;
                    arr[3] = 0;
                    arr[4] = 0;
                break;
                case "MULTC" :
                    arr[0] = 0;
                    arr[1] = 1;
                    arr[2] = 1;
                    arr[3] = 0;
                    arr[4] = 1;
                break;
                case "LSFTL" :
                    arr[0] = 0;
                    arr[1] = 1;
                    arr[2] = 1;
                    arr[3] = 1;
                    arr[4] = 0;
                break;
                case "LSFTLC" :
                    arr[0] = 0;
                    arr[1] = 1;
                    arr[2] = 1;
                    arr[3] = 1;
                    arr[4] = 1;
                break;
                case "LSFTR" :
                    arr[0] = 1;
                    arr[1] = 0;
                    arr[2] = 0;
                    arr[3] = 0;
                    arr[4] = 0;
                break;
                case "LSFTRC" :
                    arr[0] = 1;
                    arr[1] = 0;
                    arr[2] = 0;
                    arr[3] = 0;
                    arr[4] = 1;
                break;
                case "ASFTR" :
                    arr[0] = 1;
                    arr[1] = 0;
                    arr[2] = 0;
                    arr[3] = 1;
                    arr[4] = 0;
                break;
                case "ASFTRC" :
                    arr[0] = 1;
                    arr[1] = 0;
                    arr[2] = 0;
                    arr[3] = 1;
                    arr[4] = 1;
                break;
                case "RL" :
                    arr[0] = 1;
                    arr[1] = 0;
                    arr[2] = 1;
                    arr[3] = 0;
                    arr[4] = 0;
                break;
                case "RLC" :
                    arr[0] = 1;
                    arr[1] = 0;
                    arr[2] = 1;
                    arr[3] = 0;
                    arr[4] = 1;
                break;
                case "RR" :
                    arr[0] = 1;
                    arr[1] = 0;
                    arr[2] = 1;
                    arr[3] = 1;
                    arr[4] = 0;
                break;
                case "RRC" :
                    arr[0] = 1;
                    arr[1] = 0;
                    arr[2] = 1;
                    arr[3] = 1;
                    arr[4] = 1;
                break;

            }

            String s2[] = bi(Integer.parseInt(s[1]) , 3).split("");

            for(int j = 0; j < s2.length; j++) {
                arr[6 + j] = Integer.parseInt(s2[j]);
            }

            s2 = bi(Integer.parseInt(s[2]) , 3).split("");

            for(int j = 0; j < s2.length; j++) {
                arr[9 + j] = Integer.parseInt(s2[j]);
            }

            if(arr[4] == 0) {
                s2 = bi(Integer.parseInt(s[3]) , 3).split("");

                for(int j = 0; j < s2.length; j++) {
                    arr[12 + j] = Integer.parseInt(s2[j]);
                }

                arr[15] = 0;
            }else {
                s2 = bi(Integer.parseInt(s[3]) , 4).split("");

                for(int j = 0; j < s2.length; j++) {
                    arr[12 + j] = Integer.parseInt(s2[j]);
                }
            }

            for(int j = 0; j < arr.length; j++) {
                sb.append(arr[j]);
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());



    }

    static String bi(int a , int b) {

        StringBuilder sb = new StringBuilder();

        if(a == 0) {
            sb.append("0");
        }

        while (a != 0) {
            int s = a / 2;
            int r = a % 2;

            sb.append(r);

            a = s;
        }

        int bi_num = Integer.parseInt(sb.reverse().toString());

        return String.format("%0" + b + "d" , bi_num);
    }
}
