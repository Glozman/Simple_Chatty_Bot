import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.print(s1.replaceAll(" ","").equals(s2.replaceAll(" ","")));


    }
}