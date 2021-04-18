import java.util.Scanner;

public class SumofNatural {
    public static void main(String[] args){
        int sum=0;
        System.out.println("Enter one integer number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=1; i<=a; i++){
            sum = sum+i;
        }
        System.out.println("sum is" + ""+sum);
    }
}
