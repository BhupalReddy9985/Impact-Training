import java.util.*;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int count = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println("Number is even: ");
            } else {
                n = (3*n+1);
                System.out.println("Number is odd: ");
            }
            count++;
        }

        
    }
}
