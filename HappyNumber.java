import java.util.*;
public class Happynumber{
    public static int happynumber (int number){
        int a =0 ,b=0;
        while(number>0){
            a=number%10;
            b=b+(a*a);
            number=number/10;
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println("write a postive number:");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int result=number;
        while(result != 1 && result != 4){
            result=happynumber(result);
        }
        if (result==1){
            System.out.println("It is a happy number");
        }
        else{
            System.out.println("It is not a Happy number");
        }
    }
    }
