
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        ArrayList<String> arr = new ArrayList<>();

        String aa[] = a.split("");
        String bb[] = b.split("");

        boolean tf = false;

        for(int i = 0; i < bb.length; i++) {
            arr.add(bb[i]);
        }

        if(a.equals(b)) {
            tf = true;
        }

        while (aa.length != arr.size()) {

            if(arr.get(arr.size()-1).equals("A")) {
                arr.remove(arr.size() - 1);
            }else {
                arr.remove(arr.size() - 1);
                Collections.reverse(arr);
            }


        }

        StringBuilder sb = new StringBuilder();
        for(String q : arr) {
            sb.append(q);
        }

        if(a.equals(sb.toString())) {
            tf = true;
        }

        if(tf == true) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }


    }
}
