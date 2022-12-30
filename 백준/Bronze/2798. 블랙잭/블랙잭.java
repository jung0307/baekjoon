
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        String arr2[] = br.readLine().split(" ");
        ArrayList<Integer> arrInt = new ArrayList<>();

        for(int i = 0; i < n-2; i++) {

            for(int j = i+1; j < n-1; j++) {

                for(int k = j+1; k < n; k++) {
                    //System.out.println(i+" "+j+" "+k);
                    //System.out.println(arr2[i]+" "+arr2[j]+" "+arr2[k]);
                    //count++;

                    if(Integer.parseInt(arr2[i])+Integer.parseInt(arr2[j])+Integer.parseInt(arr2[k]) <= m) {
                        arrInt.add(Integer.parseInt(arr2[i])+Integer.parseInt(arr2[j])+Integer.parseInt(arr2[k]));
                    }
                }

            }

        }

        int max = arrInt.get(0);
        for(int i = 0; i < arrInt.size(); i++) {
           if(max < arrInt.get(i)) {
               max = arrInt.get(i);
           }
        }

        System.out.println(max);




    }
}
