import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());

        for (int k = num1; k <= num2; k++)
        {
            if ((k % 5 == 0) && (k % 3 == 0))
            {
                System.out.println("FizzBuzz");
            }
            else if (k % 3 == 0)
            {
                System.out.println("Fizz");
            } else if (k % 5 == 0) {
                System.out.println("Buzz");
            }
            else
                {
                System.out.println(k);
            }
        }
    }
}