
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("0") ) {
            arr = s.split("");
            boolean tf = false;
            for(int i = 0; i <= arr.length/2; i++) {
                if(!arr[i].equals(arr[arr.length-i-1])) {
                    tf = true;
                    break;
                }
            }

            if(tf == true) {
                sb.append("no\n");
            }else {
                sb.append("yes\n");
            }
        }

        System.out.print(sb.toString());

    }


}
