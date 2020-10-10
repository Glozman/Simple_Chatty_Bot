import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (scanner.hasNext())
        {
            int num1 = scanner.nextInt();

            if (num1 >= num )
            {
                num = num1;
            }
            else
            {
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }
}