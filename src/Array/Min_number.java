package Array;

import java.util.Scanner;

public class Min_number {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Student");
        int n=sc.nextInt();
        int marks[]= new int[n];
        System.out.println("marks of Student");
        int min =Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            marks[i]=sc.nextInt();

        if(marks[i]<min){
            min=marks[i];
        }
        }
        System.out.println("Min number is ="+min);
    }
}
