import java.util.*;

class  problem6{
    public static void main(String[] args){
        int a=45;
        int b=55;
  
        // if(a==b){
        //     System.out.println("Both are equals.");
        // }
        // else if(a>b){
        //     System.out.println(a+"\tis greater.");
        // }
        // else{
        //     System.out.println(b+"\tis greater.");
        // }

        //second method

        // int ans=(a>b)?a:b;
        // System.out.println(ans);

        //third method

        int ans=Math.max(a,b);
        System.out.println(ans+"is greater");
    }
}