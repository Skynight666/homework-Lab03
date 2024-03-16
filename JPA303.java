public class JPA303 {
    public static void main(String[] args) {
        System.out.println("1~1000之間的完美數有：");
        for (int num = 1; num <= 1000; num++) {
            if (isPN(num)) {
                System.out.println(num);
            }
        }
    }
    public static boolean isPN(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}

