import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int num1 =Integer.parseInt(String.valueOf(a.charAt(0)));
        int num2 =Integer.parseInt(String.valueOf(a.charAt(1)));
        int num3 =Integer.parseInt(String.valueOf(a.charAt(2)));
        int num4 =Integer.parseInt(String.valueOf(a.charAt(3)));

        if ((num1 == num4) && (num2 == num3))
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(2);
        }


    }
}