//print 1 to n -> Done

import java.util.Scanner;

public class Recursion2 {

    static void print1ToN(int s, int n){
     //
        if(s==n+1)return ;
        System.out.println(s);
        s++;
        print1ToN(s, n);
    }

    public static void main(String[] args){
        System.out.println("Enter your number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();

        print1ToN(-1, num);
    }
}
