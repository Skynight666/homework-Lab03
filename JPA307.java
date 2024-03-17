import java.util.Scanner;
public class JPA307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, num2;
        int count;

        while (true) {
            System.out.print("Input:");
            num = scanner.nextInt();
            if (num == 999) {
                break;
            }
            num2 = scanner.nextInt();
            count = 1;
            for (int i = 1; i <= num && i <= num2; i++) {
                if (num % i == 0 && num2 % i == 0) {
                    count = i;
                }
            }
            System.out.println(count);
        }
    }
}

