/* Arrays differences */
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the array size");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for( int i=0;i<num; i++){
            arr[i] = sc.nextInt();

        } 
        int diff = arr[0];
        for(int j=1; j<num; j++){
            diff-= arr[j];

        }
        System.out.println("diff:"+diff);
        sc.close();
    }  
    
}
