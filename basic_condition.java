import java.util.*;
public class condition {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter a: ");
        int a= input.nextInt();
        System.out.print("enter b: ");
        int b= input.nextInt();
        System.out.print("enter c: ");
        int c= input.nextInt();

        if (a>b) {
            if(a>c) System.out.println("a is greater");
            
        }
        else{
            if(b>c) System.out.println("b is greater");
            else System.out.println("c is greater");
        }
    }
}
