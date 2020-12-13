import java.util.Scanner;

public class StackTrace {

    public static int factorial(int n){
        System.out.println("factorial("+n+")");
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        for (StackTraceElement elem:stackTrace) {
            System.out.println(elem);
        }
        int r = 1;
        if (n <= 1)
            r = 1;
        else
            r = n * factorial(n-1);
        System.out.println("return "+r);
        return r;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer number:");
        int n = scanner.nextInt();
        factorial(n);
    }
}
