import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int k = 0;
        for (int i = 1; i<=num; i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print(i +" ");
                k++;
                if (k == num)
                    break;

            }
            if (k == num)
                break;
        }
    }
}