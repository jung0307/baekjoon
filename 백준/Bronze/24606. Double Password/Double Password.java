import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password1 = scanner.nextLine();
        String password2 = scanner.nextLine();

        int totalCombinations = 1;

        for (int i = 0; i < 4; i++) {
            HashSet<Character> uniqueDigits = new HashSet<>();
            uniqueDigits.add(password1.charAt(i));
            uniqueDigits.add(password2.charAt(i));

            totalCombinations *= uniqueDigits.size();
        }

        System.out.println(totalCombinations);

        scanner.close();
    }
}
