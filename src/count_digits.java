import java.util.Scanner;

public class count_digits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n= sc.nextInt();
        int count=0;
        while(n>0){
            int dig=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
