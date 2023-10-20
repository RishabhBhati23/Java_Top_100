import java.util.*;

class problem29{
    public static void main(String[] args){
        int num1 = 36;  int num2 = 60 ; int gcd=0;

        for(int i=1 ; i<=num1 || i<= num2 ;i++){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
        }

        //greatest common divisors

        System.out.println("GCD is :-" + gcd);
        //done
    }
}