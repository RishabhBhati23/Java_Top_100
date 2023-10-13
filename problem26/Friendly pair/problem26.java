class problem26{
    public static void main(String[] args){
        int num1 = 6; 
        int num2 = 10;

        int sum1=getDivisorsNum(num1);
        int sum2=getDivisorsNum(num2);

        if(sum1/num1 == sum2/num2){
             System.out.println("both numbers is a Friendly pair.");
        }
        else{
            System.out.println("both number is not a Friendly pair.");
        }
    }

    static int getDivisorsNum(int num){
        int sum =0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum = sum +i;
            }
        }
        return sum;
    }
}