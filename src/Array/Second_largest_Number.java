package Array;
import java.util.Scanner;
public class Second_largest_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of A");
        int n= sc.nextInt();
        int a[]=new int[n];
        int temp;
    System.out.println("Enter the Number");
        for(int i=0; i<n; i++)
            a[i]=sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    System.out.println("Second largest element is = "+a[n-2]);
    }
}
