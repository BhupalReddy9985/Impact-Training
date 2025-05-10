/* Acc 2022 taking 2 inputs the value is nearest num */
import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: "); 
        int num = sc.nextInt();
        
        System.out.print("Enter the number for multiple: ");  
        int m = sc.nextInt();   

        int quot = num / m;
        int lb = quot * m;            
        int ub = (quot + 1) * m;
        int d1 = num - lb;
        int d2 = ub - num;

        if (d1 > d2 || d1 == d2) {
            System.out.println("Nearest multiple is: " + ub);
        } else {
            System.out.println("Nearest multiple is: " + lb);
        }
    }
}
