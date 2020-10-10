import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bus = scanner.nextInt();
        int countbridge = scanner.nextInt();
        boolean test = false;
        int result = 0;

        for (int i = 1; i < countbridge; i++) {
            int bridge = scanner.nextInt();

            if (bus >= bridge && test == false)
            {
                result = i;
                test = true;
            }
        }
        if (test == true)
        {
            System.out.println("Will crash on bridge " + result);
        }
        else
        {
            System.out.println("Will not crash");
        }
    }
}