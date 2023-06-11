

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split("");
        String s2[] = new String[n];

        int z = 0;
        String ss = "";

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 6; j++) {
                ss = ss + s[z++];
            }
            s2[i] = ss;
            ss = "";
        }

//        for(String x : s2) {
//            System.out.println(x);
//        }

//        String q = "abc";
//        String w = "acb";

//        for(int i = 0; i < 3; i++) {
//            if(q.charAt(i) == w.charAt(i)) {
//                System.out.println("맞다");
//            }else {
//                System.out.println("틀리다");
//            }
//        }

        StringBuilder sb = new StringBuilder();
        boolean tf2 = false;

        for(int i = 0; i < n; i++) {
            String e = divi(s2[i]);

            if(!e.equals("")) {
                sb.append(e);
            }else {
                System.out.println(i+1);
                tf2 = true;
                break;
            }

        }

        if(tf2 == false) {
            System.out.print(sb.toString());
        }

    }

    static String divi(String b) {
        Boolean[][] tf = new Boolean[8][6];
        String d = "";

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 6; j++) {
                tf[i][j] = false;
            }
        }

        for(int i = 0; i < 8; i++) {

            String s = "";
            if(i == 0) {
                s = "000000";
            } else if (i == 1) {
                s = "001111";
            } else if (i == 2) {
                s = "010011";
            } else if (i == 3) {
                s = "011100";
            } else if (i == 4) {
                s = "100110";
            } else if (i == 5) {
                s = "101001";
            } else if (i == 6) {
                s = "110101";
            } else if (i == 7) {
                s = "111010";
            }

            for(int j = 0; j < 6; j++) {
                if(  b.charAt(j) == s.charAt(j)) {
                    tf[i][j] = true;
                }
            }

        }

        int sum = 0;

//        for(Boolean[] aa : tf) {
//            for(Boolean bb : aa) {
//                System.out.print(bb);
//            }
//            System.out.println();
//        }

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 6; j++) {
                if(tf[i][j] == false) {
                    sum++;
                }
            }

            //System.out.println(sum);

            if(sum <= 1) {

                if(i == 0) {
                    d = "A";
                } else if (i == 1) {
                    d = "B";
                } else if (i == 2) {
                    d = "C";
                } else if (i == 3) {
                    d = "D";
                } else if (i == 4) {
                    d = "E";
                } else if (i == 5) {
                    d = "F";
                } else if (i == 6) {
                    d = "G";
                } else if (i == 7) {
                    d = "H";
                }

                break;
            }

            //System.out.println("d = " + d);
            sum = 0;

        }
        return d;
    }
}
