import java.util.*;
class problem1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         
        System.out.println("Enter the number:-"); 
        int a=sc.nextInt();

        if(a>0){
            System.out.println("number is positve.");
        }
        else if(a<0){
            System.out.println("number is negative.");
        }
        else{
            System.out.println("number is 0.");
        }
    }
}