import java.util.*;

class problem21{
    public static void main(String[] args){
        int num=145;

        if(checkStrong(num)){
            System.out.println(num+"-is strong number.");
        }
        else{
            System.out.println(num+"- is not strong number.");
        }
    }

    static int getFact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    static boolean checkStrong(int num){
        int sum=0; int temp;int digit;
        temp=num;
        boolean flag=false;
        while(temp!=0){
            digit=temp%10;
            sum=sum+getFact(digit);
            temp/=10;
        }

        if(sum==num)
          flag = true;
        else
          flag = false;
        
        return flag;
    }
}