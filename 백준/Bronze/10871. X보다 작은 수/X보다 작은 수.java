import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int X = input.nextInt();
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            if (A[i] < X) {
                System.out.print(A[i] + " ");
            }
        }
        
        input.close();
    }
}