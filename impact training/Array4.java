/* Distinct elements */
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            boolean isDistinct = true;
            for (int k = 0; k < j; k++) {
                if (arr[j] == arr[k]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
            }
        }

        System.out.println("Distinct elements: " + count);
    }
}
