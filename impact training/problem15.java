/*kaprekar number */
import java.util.*;

public class problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sq = number * number;
        int temp = number;

        int count = 0;
        int n = temp;
        while (n != 0) {
            count++;
            n /= 10;
        }

        int power = (int) Math.pow(10, count);
        int right = sq % power;
        int left = sq / power;

        if ((left + right) == number)
            System.out.println(number + " is a Kaprekar number.");
        else
            System.out.println(number + " is not a Kaprekar number.");

        sc.close();
    }
}
