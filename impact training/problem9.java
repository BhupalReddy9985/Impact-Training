/* sum of odd numbers and even numbers */
import java.util.*;
public class problem9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumodd = 0;
        int sumeven = 0;
        int count = 0;

        while(num != 0){
            int digit = num % 10;
            if(digit % 2 == 0){
                sumeven += digit;
            } else {
                sumodd += digit;
            }
            num /= 10;
            count++;
        }

        System.out.println("Odd sum: " + sumodd);
        System.out.println("Even sum: " + sumeven);
        System.out.println("Count: " + count);  
    }
}