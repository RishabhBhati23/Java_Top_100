class problem14{
    public static void main(String[] args){
        int num=107; int len;
        
        //to get the length of num
        len=order(num);
        
        if(Armstrong(num,len)){
            System.out.println(num + "is Armstrong");
        }
        else{
            System.out.println(num + "is not Armstrong");
        }
        
    }

    static int order(int x){
            int len=0;
            while(x!=0){
                len++;
                x=x/10;
            }
            return len;
    }

    static boolean Armstrong(int num,int len){
        int temp ,  sum=0 ,  digit;
        temp=num;

        while(temp!=0){
            digit = temp %10;
            sum=sum+(int)Math.pow(digit,len);
            temp=temp/10; 
        }

        return num == sum;
    }


}