import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int count = 0;
        int sum = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = n; i <= m; i++){
            count = 0;
            for(int j = 1; j <= i; j++) {

                if(i == 1 || count > 2){
                    break;
                }

                if(i%j == 0) {
                    count++;
                }

                if(j == i){
                    if(count == 2){
                        arr.add(i);
                    }
                }
            }
        }

//        for(int i = 0; i < arr.size(); i++){
//            System.out.println(arr.get(i));
//        }

        if(arr.size() == 0){
            System.out.println("-1");
        }else{
            int min = arr.get(0);
            for(int i = 0; i < arr.size() - 1; i++){

                if(min > arr.get(i+1)){
                    min = arr.get(i+1);
                }
                sum = sum + arr.get(i);
            }
            sum = sum + arr.get(arr.size()-1);
            System.out.println(sum);
            System.out.println(min);
        }



    }

}
