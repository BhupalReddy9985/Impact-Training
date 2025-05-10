import java.util.*;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oddDigitCount = 0;

        for (int i = 1; i <= num; i++) {
            int temp = i;
            int position = 1;
            while (temp != 0) {
                int digit = temp % 10;
                if (position % 2 != 0 && digit % 2 != 0) {
                    oddDigitCount++;
                }
                temp /= 10;
                position++;
            }
        }

        System.out.println("Total odd digits at odd positions: " + oddDigitCount);
    }
}
