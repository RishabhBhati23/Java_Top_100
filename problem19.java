import java.util.*;

class problem19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int base=sc.nextInt();
        int power=sc.nextInt();

        int result=(int)Math.pow(base,power);


        System.out.println(result);
    }
}