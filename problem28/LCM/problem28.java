import java.util.*;

class problem28{
    public static void main(String[] args){
        int num1=12; int num2=30;  int hcf=1;

        //calculate the hcf first

        for(int i=1 ; i<=num1 || i<=num2 ;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }

        //formulla of the LCM here

        int lcm = (num1*num2) / hcf;

        System.out.println("the LCM is:-" + lcm);
    }
}