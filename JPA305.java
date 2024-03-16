import java.util.Scanner;
public class JPA305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter one value：");
            int num = scanner.nextInt();
            if (num<1||num>10) {
                System.out.print("Error. the value is out of range.\n");
            } else {
                sum = 1;
                for (int j = 1; j <= num; j++) {
                    sum *= j;
                }
                System.out.print(num+"!= "+ sum);
                System.out.print("\n");
            }
        }
    }
}
