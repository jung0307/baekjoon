
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String l = "";
        int a = 0;
        for(int i = 0 ; i < n; i++) {
            String s = br.readLine();
            a = s.length();
            l = l + s;
        }
//        System.out.println(l);
//        System.out.println(a);
        String arr[] = l.split("");

        String arr2[] = new String[a];

        for(int i = 0; i < a; i++) {
            boolean tf = false;
            for(int j = 0; j < n; j++) {
                if(arr[i].equals(arr[j*a+i])) {
                    tf = false;
                }else {
//                    System.out.println(arr[i] + " i : " + i);
//                    System.out.println("---");
//                    System.out.println(arr[j*a+i] + " j*a+i : " +(j*a+i));
                    tf = true;
                    break;
                }
            }
            if(tf == false) {
                arr2[i] = arr[i];
            }else {
                arr2[i] = "?";
            }
        }

        for(String c : arr2) {
            System.out.print(c);
        }
    }
}
