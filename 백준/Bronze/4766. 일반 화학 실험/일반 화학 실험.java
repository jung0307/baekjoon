
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        ArrayList<Float> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while ( !(s = br.readLine()).equals("999") ) {
            float a = Float.parseFloat(s);
            arr.add(a);
        }

        for(int i = 0; i < arr.size() -1; i++) {
            float b = arr.get(i+1) - arr.get(i);
            String c = String.format("%.2f" , b);
            sb.append(c+"\n");
        }

        System.out.print(sb.toString());

    }
}
