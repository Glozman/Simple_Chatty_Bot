import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        boolean a = s.toUpperCase().startsWith("J");
        System.out.println(a);


    }
}