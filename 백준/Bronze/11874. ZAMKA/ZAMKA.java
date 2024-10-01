import java.util.Scanner;

public class Main {
    
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        
        int N = 0;
        int M = 0;
        
        for (int i = L; i <= D; i++) {
            if (sumOfDigits(i) == X) {
                N = i;
                break;
            }
        }
        
        for (int i = D; i >= L; i--) {
            if (sumOfDigits(i) == X) {
                M = i;
                break;
            }
        }
        
        System.out.println(N);
        System.out.println(M);
        
        sc.close();
    }
}
