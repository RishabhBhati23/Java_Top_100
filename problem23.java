class problem23{
    public static void main(String[] args){
        int n=376; int sqr=n*n;

        if(isAutomorphic(n)==1){
            System.out.println("number is automorphic.");
        }

        else{
            System.out.println("number is not automorphic.");
        }
        
    }

    static int isAutomorphic(int n){
        int sqr=n*n;
        while(n!=0){
            if(n%10 != sqr%10){
                return 0;
            }

            n/=10;
            sqr/=10;
        }
        return 1;
    }
}