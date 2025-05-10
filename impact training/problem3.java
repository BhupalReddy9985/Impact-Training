import java.util.*;
public class problem3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int goldcoins = sc.nextInt();
        int benshare = sc.nextInt();
        int blackshare = sc.nextInt();
        
        int bencoins = (benshare * goldcoins) / 100;
        int updatedcoins = goldcoins- bencoins;
        int blackcoins = (blackshare * updatedcoins) / 100;
        int leftcoins = goldcoins - bencoins - blackcoins;

        int sharePerPirate = leftcoins / 3;
        int throwncoins = leftcoins % 3;
        
        System.out.println("Ben's coins: " + bencoins);
        System.out.println("Black's coins: " + blackcoins);
        System.out.println("Share per pirate: " + sharePerPirate);
        System.out.println("Coins thrown into the sea: " + throwncoins);
        sc.close();
    }
}
