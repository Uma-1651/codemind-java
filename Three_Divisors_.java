import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = countNumbersWithThreeDivisors(n);
        System.out.println(count);
    }

    public static int countNumbersWithThreeDivisors(int n) {
        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime(i) && i * i <= n) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
