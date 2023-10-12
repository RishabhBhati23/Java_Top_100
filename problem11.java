class problem11{
    public static void main(String[] args){
        int n=12545; int sum=0;

        // while(n!=0){
        //     sum+=n%10;
        //     n=n/10;
        // }

        System.out.println("sum is:-"+getSum(n,sum));
    }

    static int getSum(int num,int sum){
        if(num==0){
            return sum;
        }

        sum+=num%10;

        return getSum(num/10,sum);
    }
}