// NAME : Haindavi
// REG NO : 20MIS7047
import java.util.*;
public class reverse {
    static String st = new String();
    static char rev[] = new char[7];
    static int top;
    public static void main(String args[]) {
        top=-1;
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter string to reverse");
        st=S1.nextLine();
        for(int i=0;i<st.length();i++){
            push(st.charAt(i));
        }
        System.out.print("string after reversal is :- ");
        for(int i=top;i>=0;i--) {
            pop();
        }
    }
    public static void push(char ch) {
        top++;
        rev[top]=ch;
        System.out.println(ch);
    }
    public static void pop() {
        System.out.print(rev[top]);
        top--;
    }
}