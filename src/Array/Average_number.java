package Array;
import java.util.Scanner;
public class Average_number {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Subject of student");
        int n=sc.nextInt();
        int marks[]=new int[n];
        int sum=0;
        double average=1;
        System.out.println("Enter marks of Student");
        for(int i=0; i<n; i++ ){
            marks[i]= sc.nextInt();
            sum=sum+marks[i];
             average=(double)sum/n;
        }
        System.out.println("average Number is ="+average);
    }
}
