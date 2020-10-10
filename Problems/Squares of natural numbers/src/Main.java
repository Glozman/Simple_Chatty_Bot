import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num = scaner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num;i++)
        {
            sum = (int) Math.pow(i,2);
            if (sum <= num)
            {
                System.out.println(sum);
            }
        }
    }
}