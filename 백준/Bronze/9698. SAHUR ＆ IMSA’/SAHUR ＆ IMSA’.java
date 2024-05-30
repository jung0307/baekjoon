import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = scanner.nextInt(); 
        
        for (int t = 1; t <= T; t++) {
            int H = scanner.nextInt(); 
            int M = scanner.nextInt();
            
            int totalMinutes = H * 60 + M; 
            totalMinutes -= 45;  
            
            if (totalMinutes < 0) {
                totalMinutes += 24 * 60;
            }

            int newH = totalMinutes / 60;
            int newM = totalMinutes % 60;

            sb.append("Case #" + t + ": " + newH + " " + newM + "\n");
        }

        scanner.close();  
        System.out.print(sb.toString());
    }
}
