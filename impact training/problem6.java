import java.util.Scanner;
public class problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("It is wired");
        }else if(num%2==0 && (num>=2 && num<=5)){
            System.out.println("It is not wired");
        }else if(num > 20 && (num>=6 && num<=20)){
            System.out.println("It is not wired");
        }else if (num%2==0 && (num>20)){
            System.out.println("It is  not wired");
        }
    sc.close();
        }
        
    }
    

