/* Arm strong number */
import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int Num = num;
        int count = 0;
        int sum = 0;

        int temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(Num + " is an Armstrong number.");
        } else {
            System.out.println(Num + " is not an Armstrong number.");
        }

        sc.close();
    }
}
