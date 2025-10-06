package Maths;


//2nd file -> Done
import java.util.Scanner;
class isLeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0)) {//logic

            System.out.println("Leap year!");
        }
        else{
            System.out.println("Not a leap year!");
        }


    }
}


