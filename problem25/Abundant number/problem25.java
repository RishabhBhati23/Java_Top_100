class problem25{
    public static void main(String[] args){
        int n=18,sum=0;

        for(int i=1;i<n;i++){
            if(n%i==0)
            {
                sum=sum+i;
            }

       
        }
        //check is abundant or not.

             if(sum>n){
                System.out.println("n is abundant.");
            }
            else{
                System.out.println("n is not abundant.");
            }
    }
}