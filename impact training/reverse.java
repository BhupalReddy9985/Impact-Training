import java.util.*;
public class reverse {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the number to the reversed");
         int num = sc.nextInt();
         int rev = 0;
         while(num>0){
             int rem = num%10;
             rev = (rev*10)+rem;
             num = num/10;
sc.close();
System.out.println((rev));
            
         }
    }
} 
    
 