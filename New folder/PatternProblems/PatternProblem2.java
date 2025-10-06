package PatternProblems;

import java.util.Scanner;
/*
n=3
     *
    ***
   ******
*/
public class PatternProblem2 {
public static  void main(String[] args){
    System.out.print("Enter a value:");
    Scanner sc=new Scanner(System.in);
    int value=sc.nextInt();
    int spaces=value-1;
    int stars=1;

    for(int i=1;i<=value;i++){
        //first print the spaces.
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        //then print the star.
        for(int s=1;s<=stars; s++){
            System.out.print("*");
        }
        System.out.println();
        spaces--;
        stars=stars+2;

    }
}
}
