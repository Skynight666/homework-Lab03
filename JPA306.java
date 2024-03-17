import java.util.Scanner;

public class JPA306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, num2;

        while (true) {
            System.out.print("Input:");
            num = scanner.nextInt();
            if (num == 999) {
                break;
            }
            num2 = scanner.nextInt();
            System.out.println(Math.pow(num, num2));
        }
    }
}
