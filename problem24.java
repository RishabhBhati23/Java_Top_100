class problem24{
    public static void main(String[] args){
        int n=35;

        int result =0;
        int temp=n; 
        while(temp!=0){
            int pickLast = n%10;
            result = result + pickLast;
            temp/=10;
        }


        if(n%result==0){
            System.out.println("Number is Harshad.");
        }
        else{
            System.out.println("Number is not Harshad.");
        }
    }
}