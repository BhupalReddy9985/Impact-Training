import java.util.Scanner;
public class Array3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr1[] = new int[num];
        int arr2[] = new int[num];
        int sum1 = 0;
        int sum2 = 0;
        for(int j=0; j<num; j++){
            arr2[j] = sc.nextInt();
            System.out.println("Enter the elements");

            for(int k=0; k<num; k++){
                arr2[k] = sc.nextInt();

            }
            if(num==m){
                for(int i=0; i<num; i++){
                    sum1+= arr1[i];
                    sum2+= arr2[i];

                }
                if(sum1==sum2){
                    System.out.println("The arrays are same" +"sum of arr1:"+sum1+"sum of arr2:"+sum2);

                } else {
                    System.out.println("The arrays are not same");
                }
            }

        }
    }
    
}
