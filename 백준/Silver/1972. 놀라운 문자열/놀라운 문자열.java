import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Boolean> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        String s = "";

        while ( !(s = br.readLine()).equals("*") ) {

            String ss[] = s.split("");
            boolean tf = false;
            map = new HashMap<>();

            loopA :
            for(int i = 0; i < ss.length - 1; i++) {
                for(int j = 0; j < ss.length - 1 - i; j++) {
                    String a = ss[j] + "" + ss[j+1+i];

                    if(map.get(a) == null) {
                        map.put(a , true);
                    }else {
                        tf = true;
                        break loopA;
                    }
                }
                map = new HashMap<>();
            }

            if(tf == false) {
                sb.append(s + " is surprising.\n");
            }else {
                sb.append(s + " is NOT surprising.\n");
            }

        }

        System.out.print(sb.toString());

    }

}
