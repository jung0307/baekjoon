
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        StringBuilder sb = new StringBuilder();

        int arrInt[] = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i = 0; i < a.length(); i++) {
            arr.add(arrInt[(int)a.charAt(i) - 65]);
            arr.add(arrInt[(int)b.charAt(i) - 65]);
        }

        int i = 0;

        while (true) {

            if(i < arr.size() - 1) {
                String z = arr.get(i) + arr.get(i + 1) + "";
                char n = (z).charAt(z.length() - 1);
                arr2.add(Integer.parseInt((n+"").toString()));

                i = i + 1;

            }else {

                i = 0;
                arr = arr2;
                arr2 = new ArrayList<>();

            }

            if(arr2.size() == 2 && arr.size() == 3) {
                break;
            }

        }

       System.out.println(arr2.get(0)+""+arr2.get(1));

    }
}
