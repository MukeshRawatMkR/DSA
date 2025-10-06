package PatternProblems;


import java.util.Scanner;

//half right angle:
//n=4;
/*
*
**
***
****
*/
public class PatternProblem1 {
    public static void main(String[]args){
        System.out.print("Enter a value:");
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        for(int i=1;i<=value;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
