import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int arr[] = new int[10001];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 1; i <= 10000; i++) {
            int num = d(i);

            if(num <= 10000) {
                arr[num] = num;
            }
        }
        for(int j = 1; j <= arr.length-1; j++) {

            if(arr[j] == 0){
                bw.write(j + "\n");
            }

        }
        bw.flush();
        bw.close();
    }

    static int d(int i) {

        String arr[] = Integer.toString(i).split("");
        int num = 0;
        for(int j = 0; j < arr.length; j++) {
            num = num + Integer.parseInt(arr[j]);
        }
        num = i + num;
        return num;
    }
}

