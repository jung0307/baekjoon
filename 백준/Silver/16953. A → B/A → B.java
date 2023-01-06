
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int count = 0;
        boolean tf = false;

            while (m >= 1) {

                if(m == n) {
                    tf = true;
                    break;
                }

                String q[] = Integer.toString(m).split("");
                if(q[q.length-1].equals("3") || q[q.length-1].equals("5") ||
                        q[q.length-1].equals("7") || q[q.length-1].equals("9")) {
                    break;
                }
                q = null;



                if(m%2 != 0 && m > 1) {
                    String a = Integer.toString(m);
                    String a1[] = a.split("");
                    String b = "";
                    for(int i = 0; i < a1.length -1; i++) {
                        b = b+a1[i];
                    }
                    m = Integer.parseInt(b);
                }else{
                    m = m/2;
                }
                count++;
                //System.out.println(m);
            }


            if(tf == false) {
                System.out.println("-1");
            }else {
                System.out.println(count+1);
            }


    }
}
