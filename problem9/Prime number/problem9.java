class problem9{
    public static void main(String[] args){
        int i=2,n=11;
        boolean isPrime = checkPrime(n,i);
        /*  
        if(n<2){
            isPrime = false;
        }
        else{
            for(i=2;i<n;i++){    //for optimizing way for(int i=2;i<=n;i++)
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        */

        String result=isPrime?"prime":"not prime";

        System.out.println("the number::"+n+"::is_>"+result);
    }

    static boolean checkPrime(int n,int i){
        //for 0,1 and negative are not a prime number.
        if(n<2)
          return false;
        
        //base case
        if(n==i)
         return true;

        if(n%i==0)
         return false;

        i+=1; 

        return checkPrime(n,i); 

    }
}