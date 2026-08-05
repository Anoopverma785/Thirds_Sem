import java.util.Scanner;
public class armstrong_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0) {
            int dig = n % 10;
            sum = sum + (dig * dig * dig);
            n = n / 10;
        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("it is armstrong number");
        }else{
            System.out.println("it is not armstrong number");
    }
}}
