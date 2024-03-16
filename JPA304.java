import java.util.Scanner;
public class JPA304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; // 餐点数量
        double totalCost = 0.0; // 总费用

        // 循环读取用户输入的餐点费用，直到输入-1为止
        while (true) {
            System.out.print("Please enter meal dollars or enter -1 to stop：");
            double cost = scanner.nextDouble();
            
            // 如果输入-1，则结束循环
            if (cost == -1) {
                break;
            }

            count++; // 增加餐点数量
            totalCost += cost; // 增加总费用
        }

        // 计算平均费用
        double averageCost = count > 0 ? totalCost / count : 0.0;
        averageCost = Math.round(averageCost * 100.0) / 100.0;


        System.out.println("餐點總費用：" + totalCost);
        System.out.printf(count + "道餐點平均費用為：%.2f\n", averageCost);
    }
}
