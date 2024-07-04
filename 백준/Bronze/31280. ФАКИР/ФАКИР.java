import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int[] mice = {a, b, c, d};
        
        int totalMice = a + b + c + d;
        
        int minMice = Math.min(Math.min(a, b), Math.min(c, d));
        
        int result = totalMice - minMice + 1;
        
        System.out.println(result);
        
        scanner.close();
    }
}