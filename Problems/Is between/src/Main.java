import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());

        if (((a >= b) && (a <= c)) || ((a <= b) && (a >= c)))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}