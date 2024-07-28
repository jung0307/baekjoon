import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        String era1 = "";
        String era2 = "";
        int eraYear1 = 0;
        int eraYear2 = 0;

        if(s1[0].equals("AD")) {
            era1 = "AD";
            eraYear1 = Integer.parseInt(s1[1]);
        }
        else if(s1[0].equals("BC")) {
            era1 = "BC";
            eraYear1 = Integer.parseInt(s1[1]);
        }
        else if(s1[1].equals("AD")) {
            era1 = "AD";
            eraYear1 = Integer.parseInt(s1[0]);
        }
        else if(s1[1].equals("BC")) {
            era1 = "BC";
            eraYear1 = Integer.parseInt(s1[0]);
        }

        if(s2[0].equals("AD")) {
            era2 = "AD";
            eraYear2 = Integer.parseInt(s2[1]);
        }
        else if(s2[0].equals("BC")) {
            era2 = "BC";
            eraYear2 = Integer.parseInt(s2[1]);
        }
        else if(s2[1].equals("AD")) {
            era2 = "AD";
            eraYear2 = Integer.parseInt(s2[0]);
        }
        else if(s2[1].equals("BC")) {
            era2 = "BC";
            eraYear2 = Integer.parseInt(s2[0]);
        }


        if(era1 == era2) {
            int max = (int)Math.max(eraYear1 , eraYear2);
            int min = (int)Math.min(eraYear1 , eraYear2);

            System.out.println(max - min);
        } else {
            System.out.println(eraYear1 + eraYear2 - 1);
        }


    }
}
