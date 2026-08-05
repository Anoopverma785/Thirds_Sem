import java.util.Scanner;
public class Fibonacci_sequence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=0;
        int b=1;
        System.out.print (a+" "+b);
        int c=1;
        for(int i=0; i<=10; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
