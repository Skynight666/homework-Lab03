import java.util.Scanner;
public class JPA304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double totalCost = 0.0;

        while (true) {
            System.out.print("Please enter meal dollars or enter -1 to stop：");
            double cost = scanner.nextDouble();
            
            if (cost == -1) {
                break;
            }

            count++;
            totalCost += cost;
        }
        double averageCost = count > 0 ? totalCost / count : 0.0;
        averageCost = Math.round(averageCost * 100.0) / 100.0;

        System.out.println("餐點總費用：" + totalCost);
        System.out.printf( count + " 道餐點平均費用為：%.2f\n", averageCost);
    }
}
