import java.util.*;
class SumofNaturalRecursion {
    public static int recursion(int n){
        if(n<=1)
            return n;
        return n+ recursion(n -1);
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a single integer");
        int n=s.nextInt();
        System.out.println("Sum " + recursion(n));
    }
}