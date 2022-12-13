import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String arr[] = s.split(" ");
        int arrInt[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arrInt[i] = Integer.parseInt(arr[i]);
        }
        int sum = 0;
        int count = 0;

        for(int i =0; i<n; i++) {
            count = 0;
        //    System.out.println(arrInt[i]);

            for(int j = 1; j <= arrInt[i]; j++) {

                if(arrInt[i] == 1){
                    break;
                }else{
                    if(arrInt[i]%j == 0){
                        count++;
                    }
                }

                if(j == arrInt[i]){
                    if(count == 2){
                     //   System.out.println(arrInt[i] + " sum 증가");
                        sum++;
                    }
                }

            }

        }

        System.out.println(sum);

    }

}

