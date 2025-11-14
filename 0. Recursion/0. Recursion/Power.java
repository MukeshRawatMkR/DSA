//2nd Done (but NOT optimized for larger inputs).

class Power{
    
    public static int pow(int a, int b){
        if(b<0)throw new IllegalArgumentException("Negative exponent not allowed");
        if(a == 0 && b == 0) throw new ArithmeticException("0^0 undefined");
        if(b==0)return 1;

        return a*pow(a, b-1);
    }
    
    public static void main(String[]args){
        System.out.println(pow(2,-9));
    }
}