import java.util.*;
public class for_loop {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
