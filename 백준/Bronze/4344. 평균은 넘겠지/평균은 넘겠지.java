import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        for(int i=0; i<C; i++) {
            int[] N = new int[sc.nextInt()]; 
            int sum = 0;
            int avg = 0;
            int cnt = 0;
  
            for(int j=0; j<N.length; j++) {
                N[j] = sc.nextInt(); 
                sum += N[j];
            }
            avg = sum/(N.length);

            for(int k=0; k<N.length; k++) {
                if(N[k] > avg) {
                    cnt++; 
                }
            }
            System.out.println(String.format("%.3f", (double)cnt/N.length * 100)+"%");
        }

    }
}
