import java.util.Scanner;

public class palidrom_number {
    static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a digit");
        int n = sc.nextInt();
        int rev=0;
        int temp=n;
        while(n>0){
           int num=n%10;
           rev=rev*10+num;
           n=n/10;
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("it is palidrom");
        }
        else {
            System.out.println("it is not palidrom");
        }
}
}
