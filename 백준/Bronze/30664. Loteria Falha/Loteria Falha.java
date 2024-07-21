import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String number = scanner.nextLine().trim();

            if (number.equals("0")) {
                break;
            }

            BigInteger n = new BigInteger(number);
            BigInteger fortyTwo = new BigInteger("42");
            
            if (n.mod(fortyTwo).equals(BigInteger.ZERO)) {
                System.out.println("PREMIADO");
            } else {
                System.out.println("TENTE NOVAMENTE");
            }
        }

        scanner.close();
    }
}