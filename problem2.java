import java.util.*;

class problem2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");

        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("nmuber is a Even.");
        }
        else{
            System.out.println("Number is odd.");
        }
    }
}