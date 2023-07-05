import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String q = "";
        int i = 1;


        while ( !(q = br.readLine()).equals("0") ) {
            String s[] = q.split(" ");

            double r = Double.parseDouble(s[0]);
            double w = Double.parseDouble(s[1])/2;
            double l = Double.parseDouble(s[2])/2;

            double a = Math.pow(w , 2) + Math.pow(l , 2);
            double b = Math.sqrt(a);

            if(r >= b) {
                sb.append("Pizza " + i + " fits on the table.\n");
            }else {
                sb.append("Pizza " + i + " does not fit on the table.\n");
            }

            i++;
        }

        System.out.print(sb.toString());



    }
}
