//Gnanitha
//Reg no:20MIS7064
import java.util.*;
import java.util.LinkedList;
public class SingleLinkedList {
    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();
        Scanner s = new Scanner(System.in);
        int option=0;
        while(option !=8){
            System.out.println("Create a node");
            System.out.println("Insert node at the Beginning");
            System.out.println("Insert node at the Middle");
            System.out.println("Insert node at the End");
            System.out.println("Delete node at Begin");
            System.out.println("Delete node at Middle");
            System.out.println("Delete node at End");
            System.out.println("Display exit");
            System.out.println("Enter your choice");
            option = s.nextInt();
            if (option == 1){
                System.out.println("Enter the value");
                int num1 = s.nextInt();
                linkedList.add(num1);
            }
            if(option == 2){
                System.out.println("Enter the element to insert");
                int num2 = s.nextInt();
                linkedList.addFirst(num2);
            }

            if(option == 3) {
                System.out.println("Enter the position to add the element");
                int position = s.nextInt();
                System.out.println("Enter the element to insert");
                int num3 = s.nextInt();
                linkedList.add(position, num3);
            }

            if(option == 4) {
                System.out.println("Enter the element to insert");
                int num4 = s.nextInt();
                linkedList.add(num4);
            }

            if(option == 5)
                linkedList.removeFirst();
            if (option == 6)
                linkedList.removeFirst();
            if (option == 7){
                System.out.println("Enter the position to remove");
                int position =s.nextInt();
                if (position < linkedList.size())
                    linkedList.remove(position);
                else
                    System.out.println("There is no element at that index");
            }
            System.out.println(linkedList);
        }
    }
}