
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        ArrayList<String> arr = new ArrayList<>();
        for(String s1 : s) {
            arr.add(s1);
        }

        if(s[0].equals("1") && s[s.length-1].equals("0")) {
            arr.add("1");
        }

        int sum = 0;
        for(int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i).equals("0") && arr.get(i+1).equals("1")) {
                sum++;
            }
        }

        System.out.println(sum);

    }
}
