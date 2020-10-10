import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        while (scanner.hasNextInt() && total < 1000) {
            int temp = scanner.nextInt();
            if (temp == 0) {
                break;
            }
            total += temp;
        }
        if (total >= 1000) {
            System.out.println(total - 1000);
        } else {
            System.out.println(total);
        }
    }
}