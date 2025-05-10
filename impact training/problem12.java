/*sum of digits and get a single digit result */
import java.util.*;

public class problem12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        while(num >= 10){
            int sum = 0;
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        System.out.println("Single-digit sum: " + num);
    }
}
