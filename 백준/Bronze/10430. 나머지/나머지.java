import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        int result1 = (a + b) % c;

        int result2 = ((a % c) + (b % c)) % c;

        int result3 = (a * b) % c;

        int result4 = ((a % c) * (b % c)) % c;


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        scanner.close();
    }
}
