import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long res = 1;
        int i = 0;
        do {
            i++;
            res *= i;
        }
        while (res <= num);

        System.out.println(i);
    }
}
