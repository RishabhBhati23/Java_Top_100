import java.util.*;

class problem8{
    public static void main(String[] args){
        int year=2022;

        if(year%400==0){
            System.out.println(year+"\t is leap year.");
        }
        else if(year%4==0 && year%100 != 0 ){
            System.out.println(year+"\t is leap year.");
        }
        else{
            System.out.println(year +"\tis not a leap year.");
        }
    }
}