import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int i =2;
        ArrayList<Integer> arr = new ArrayList<>();

        if(n==1){

        }else{
            while (true) {

                if(n == 1){
                    break;
                }

                if(n%i == 0){
                    arr.add(i);
                    n = n/i;
                    i = 2;
                }else {
                    i++;
                }


            }
        }


        for(Integer j : arr){
            System.out.println(j);
        }


    }

}
