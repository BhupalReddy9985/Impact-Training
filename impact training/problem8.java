import java.util.*;

public class problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowbound = sc.nextInt();
        int upbound = sc.nextInt();

        for (int i = lowbound; i <= upbound; i++) {
            if (i > 9 && i < 100) { 
                int lastDigit = i % 10;
                int firstDigit = i / 10;
                int sum = firstDigit + lastDigit;
                int product = firstDigit * lastDigit;

                System.out.println("Number: " + i);
                System.out.println("Sum of digits: " + sum);
                System.out.println("Product of digits: " + product);
                System.out.println();
            } else {
                System.out.println("Number is invalid: " + i);
            }
        }
    }
}
