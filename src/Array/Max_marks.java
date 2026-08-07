package Array;

import java.util.Scanner;

public class Max_marks {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Student");
        int n=sc.nextInt();
        int marks[] =new int[n];
        int max=Integer.MIN_VALUE;
        System.out.println("Marks of Student");
        for(int i=0; i<n;i++){

            marks[i]= sc.nextInt();
            if(marks[i]>max){
                max=marks[i];
            }
        }
        System.out.println("highest marks = "+max);
    }
}
