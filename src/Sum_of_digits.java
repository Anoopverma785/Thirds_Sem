import java.util.*;
public class Sum_of_digits {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digits");
        int n=sc.nextInt();
        int sum=0;
        while(n > 0) {
            int dig =n%10;
            sum+=dig;
            n=n/10;
        }
        System.out.println(sum);

    }
}
