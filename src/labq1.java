import java.util.Scanner;

public class labq1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the numbers");
        int sum=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            sum=sum+array[i];
        }
        System.out.println("sum of"+n+" number is "+ sum);
        int avg =sum/n;
        System.out.println("average of"+n+" number is "+avg);
    }

}
