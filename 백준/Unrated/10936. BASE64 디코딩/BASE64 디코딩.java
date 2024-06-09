import java.util.Base64;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String base64String = scanner.nextLine();
        scanner.close();
        
        byte[] decodedBytes = Base64.getDecoder().decode(base64String);
        String originalString = new String(decodedBytes);

        System.out.println(originalString);
    }
}
