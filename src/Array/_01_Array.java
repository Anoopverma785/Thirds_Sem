package Array;
import java.util.Arrays;
import java.util.Scanner;

public class _01_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Student");
        int n= sc.nextInt();
        int marks [] =new int[n];
        for(int i=0; i<n; i++ ){
            marks[i]=sc.nextInt();
        }
        System.out.println("marks of student");
        System.out.println(Arrays.toString(marks));
    }
}
