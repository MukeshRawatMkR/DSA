package PatternProblems;
//Imp

/*
n=5
*
**
***
**
*

*/

import java.util.Scanner;

public class PatternProblems3 {
public static  void main(String[] args){

    System.out.print("Enter a value:");
    Scanner sc=new Scanner(System.in);
    int value=sc.nextInt();
 int stars=1;
    for(int i=1;i<=value;i++){
        for(int j=1;j<=stars;j++){
            System.out.print("*");
        }
        System.out.println();
        if(i<=value/2){//logic
            stars++;
        }
        else{
            stars--;
        }

    }

    }

}

