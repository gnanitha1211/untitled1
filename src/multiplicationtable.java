import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args){
        System.out.println("Enter one integer");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=1;i<=10; i++){
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
