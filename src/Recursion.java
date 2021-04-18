import java.util.Scanner;
public class Recursion {
    static int a = 0, b = 1, c = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            printFibonacci(count - 1);
        }
    }

    public static void main(String args[]) {
        System.out.println("How many numbers you want in the sequence");
        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        System.out.print(a + " " + b);
        printFibonacci(count - 2);
    }
}
