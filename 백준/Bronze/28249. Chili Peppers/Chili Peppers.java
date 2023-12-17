import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        for(int i = 0; i < N; i++) {

            switch (br.readLine()) {

                case "Poblano" : sum = sum + 1500; break;
                case "Mirasol" : sum = sum + 6000; break;
                case "Serrano" : sum = sum + 15500; break;
                case "Cayenne" : sum = sum + 40000; break;
                case "Thai" : sum = sum + 75000; break;
                case "Habanero" : sum = sum + 125000; break;
            }

        }

        System.out.println(sum);


    }
}
