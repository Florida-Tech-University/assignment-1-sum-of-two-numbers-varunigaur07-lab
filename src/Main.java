import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Read two integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int rslt = a+b;

        // TODO: Print their sum  using println
        System.out.println(rslt);
        scanner.close();
    }
}
