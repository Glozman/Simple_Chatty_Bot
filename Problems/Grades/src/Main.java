import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r = 0;
        for (int i = 1; i <= a; i++)
        {
            int res = scanner.nextInt();
            if ((res % 4 == 0) && (res > r))
            {
                r = res;
            }
        }
        System.out.println(r);
    }
}