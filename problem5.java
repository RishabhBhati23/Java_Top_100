class problem5{
    public static void main(String[] args){
        int a=5;
        int b=10;
        int sum=getSum(0,a,b);
        // for(int i=a;i<=b;i++){
        //     sum+=i;
        //     System.out.println(sum);
        // }

        System.out.println("Sum  is :-"+sum);


    }

    static int getSum(int sum,int i,int b){
        if(i>b){
            return sum;
        }

        return i  + getSum(sum,i+1,b);
    }
}