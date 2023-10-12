class problem13{
    public static void main(String[] args){
        int n=12211; int rev=0; int rem; int temp;

        temp=n;

        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        //check nmuber is palindrome or not
        if(n==rev){
             System.out.println("number is palindrome");
        }
        else{
            System.out.println("Number is not palindorme.");
        }
    }
}