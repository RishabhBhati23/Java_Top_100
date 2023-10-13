import java.util.Scanner;
class problem16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0;int b=1;

        int length=sc.nextInt();
        
        System.out.print(a+","+b+",");

        for(int i=2;i<length;i++){
            int nextterm=a+b;
            a=b;
            b=nextterm;
            System.out.print(nextterm+",");
        }

    }
}