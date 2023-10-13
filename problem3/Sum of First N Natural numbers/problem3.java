import java.util.*;

class problem3{
    public static void main(String[] args){
        int n=10;
        int sum=getSum(n);
      /*
        for(int i=1;i<=n;i++){
            sum+=i;
            
        }
       */
        System.out.println(sum);
    }

    static int getSum(int n){
        if(n==0)
          return n;

        return n+getSum(n-1);  
    }
}