import java.util.*;
import java.util.Scanner;

class problem15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int low=sc.nextInt();
        int high=sc.nextInt();

        System.out.println("Armstrong number are given between:"+low+":and:"+high);
        
        for(int num=low;num<=high;num++){
            int sum=0; int len;int digit;

        len=getOrder(num);

        int temp=num;

        while(temp!=0){
            digit = temp%10;
            sum=sum+(int)Math.pow(digit,len);
            temp/=10;
        }
        
        if(sum==num){
            System.out.println(num+"");
        }
        }

        

        
    }

    private static int getOrder(int num){
        int len=0;
        while(num!=0){
            len++;
            num/=10;
        }
        return len;
    }
}