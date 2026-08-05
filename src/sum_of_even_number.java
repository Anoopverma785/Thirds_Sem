import java.util.*;
public class sum_of_even_number {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("the sum of even number is="+sum);
    }
}
