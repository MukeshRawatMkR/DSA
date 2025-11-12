//print n to 1
import java.util.Scanner;
class Recursion1 {
    
    public static void main(String[] args) {
        //6 =+%

        System.out.println("Enter your number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printNTo1(num);
        
    }
    
    public static void printNTo1(int n){
        //todo: why wasn't i able to run the code without writing 'static' keyword.
        if(n==0)return;
        System.out.println(n);
        n--;
        printNTo1(n);
    }
}