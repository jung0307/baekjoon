import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T, i, N, M, j, count = 0, temp;
        Vector<Integer> data = new Vector<>();

        T = scanner.nextInt();
        for(i = 0; i < T; i++)
        {
            N = scanner.nextInt();
            M = scanner.nextInt();
            count = 0;
            for(j = N; j <= M; j++)
            {
                temp = j;
                if(temp == 0)
                {
                    count++;
                }
                else
                {
                    while(temp > 1)
                    {
                        if(temp % 10 == 0)
                        {
                            count++;
                        }
                        temp = temp / 10;
                    }
                }
            }
            data.add(count);
        }
        for(Integer cnt : data)
        {
            System.out.println(cnt);
        }

        scanner.close();
    }
}