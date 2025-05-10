import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int firstdigit = num%10;
        int lastdigit = num/1000;

        System.out.println(firstdigit+lastdigit);
        sc.close();


        
    }

}