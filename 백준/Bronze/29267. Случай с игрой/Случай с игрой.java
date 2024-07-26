import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        boolean saveF = false;
        int ammo = 0;
        int ammo_save = 0;

        for(int i = 0; i < n; i++) {
            String ss = br.readLine();

            if(ss.equals("save")) {
                ammo_save = ammo;
                saveF = true;

            }
            else if (ss.equals("load")) {
                if(saveF == false) {
                    ammo = 0;
                }else {
                    ammo = ammo_save;
                }
            }
            else if (ss.equals("shoot")) {
                ammo--;
            }
            else if (ss.equals("ammo")) {
                ammo = ammo + k;
            }

            sb.append(ammo + "\n");
        }

        System.out.print(sb.toString());

    }
}
