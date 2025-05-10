import java.util.*;

public class problem5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 99&& num<999){
            int middledigit = (num/10)%10;
            if(middledigit%3==0){
                System.out.println("The number is trendy");
            }else{
                System.out.println("The number is valid but not trendy");

            }
                
        }
        else{
            System.out.println("The number is not valid");
        
        sc.close();
    }
    }

    
}
