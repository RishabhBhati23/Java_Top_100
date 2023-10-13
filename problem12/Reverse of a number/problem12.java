class problem12{
    public static void main(String[] args){
        int n=1234; int rev=0; 

        // while(n!=0){
        //     int rem=n%10;
        //     rev=rev*10+rem;
        //     n=n/10;
        // }

        System.out.println("reverse number is:-"+getReverse(n,rev));
    }

    static int getReverse(int n,int rev){
         
         if(n==0){
            return rev;
         }

         int rem=n%10;
         rev=rev*10+rem;

         return getReverse(n/10,rev);
    }
}