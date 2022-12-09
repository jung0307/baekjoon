import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main4344 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("##.000");

        int C = Integer.parseInt(br.readLine());
        int stdNum = 0;
        int sum = 0;
        double avg = 0;
        String[] arr;
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i = 0; i < C; i++){
            arr = br.readLine().split(" ");
            sum = 0;
            arr2.clear();

            for(int j = 1; j <= arr.length-1; j++){
                stdNum = Integer.parseInt(arr[0]);
                sum = sum + Integer.parseInt(arr[j]);
                avg = (double)(sum/stdNum);
            }

            for(int k = 1; k <= arr.length-1; k++){

                if(Integer.parseInt(arr[k]) > avg) {
                    arr2.add(Integer.parseInt(arr[k]));
                }
            }
            if(df.format((Math.round((double)arr2.size()/stdNum*100*1000))/1000.0).equals(".000")){
                bw.write("0.000%\n");
            }else{
                bw.write(df.format((Math.round((double)arr2.size()/stdNum*100*1000))/1000.0)+"%\n");
            }
            bw.flush();

        }
        bw.close();
        br.close();

    }
}
