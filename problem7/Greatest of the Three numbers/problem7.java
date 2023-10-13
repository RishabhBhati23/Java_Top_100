import java.util.*;

class problem7{
    public static void main(String[] args){
        int a=12;
        int b=20;
        int c=5;

        // if(a>b && a>c){
        //     System.out.println(a);
        // }
        // else if(b>a && b>c){
        //     System.out.println(b);
        // }
        // else{
        //     System.out.println(c);
        // }

        int temp = (a>b)?a:b;

        int ans = (temp>c)?temp:c;

        System.out.println(ans);
    }
}