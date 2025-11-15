//sixth file -> DONE but not optimized.
public class BinaryStringsOfLengthX {
    public static int generate(int n) {
        if(n==1)return 2;
        if(n==2)return 3;
        return generate(n-1)+generate(n-2);
    }
    
public static void main(String[]args) {
    System.out.println(generate(1));
    System.out.println(generate(2));
    System.out.println(generate(3));
    System.out.println(generate(4));
    System.out.println(generate(5));
    System.out.println(generate(6));
    System.out.println(generate(7));   
}
}
