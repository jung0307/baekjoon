import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        String n1 = "12 1600";
        String n2 = "11 894";
        String n3 = "11 1327";
        String n4 = "10 1311";
        String n5 = "9 1004";
        String n6 = "9 1178";
        String n7 = "9 1357";
        String n8 = "8 837";
        String n9 = "7 1055";
        String n10 = "6 556";
        String n11 = "6 773";

        if(n.equals("1")) {
            System.out.println(n1);
        }
        else if (n.equals("2")) {
            System.out.println(n2);
        }
        else if (n.equals("3")) {
            System.out.println(n3);
        }
        else if (n.equals("4")) {
            System.out.println(n4);
        }
        else if (n.equals("5")) {
            System.out.println(n5);
        }
        else if (n.equals("6")) {
            System.out.println(n6);
        }
        else if (n.equals("7")) {
            System.out.println(n7);
        }
        else if (n.equals("8")) {
            System.out.println(n8);
        }
        else if (n.equals("9")) {
            System.out.println(n9);
        }
        else if (n.equals("10")) {
            System.out.println(n10);
        }
        else if (n.equals("11")) {
            System.out.println(n11);
        }


    }
}
