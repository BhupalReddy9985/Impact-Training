import java.util.*;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 20) {
            if (x % 2 == 0) {
                System.out.println("Number is greater than 20 and even");
            } else {
                System.out.println("Number is greater than 20 and odd");
            }
        } else {
            if (x % 2 == 0) {
                System.out.println("Number is smaller than or equal to 20 and even");
            } else {
                System.out.println("Number is smaller than or equal to 20 and odd");
            }
        }

        sc.close();
    }
}
