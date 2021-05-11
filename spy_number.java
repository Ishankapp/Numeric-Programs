//program to check whether number is spy number or not
import java.util.Scanner;
class spy_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which needs to be checked for being spy number or not");
        int n =sc.nextInt();
        int remainder=0;
        int o=n;
        int sum=0;
        int product=1;
        while (o!=0)
        {
         remainder=o%10;
         sum=sum+remainder;
         product=product*remainder;
         o=o/10;
        }
        if(sum==product)
        {
            System.out.println("It is a spy number");
        }
        else
        {
            System.out.println("It is not a spy number");
        }
    }
}
//vdt
//s.no   //variable     // Use
//1      //int n        //Number which needs to be checked 
//2      //int remainder//remainder of number for sepertaing digits
//3      //int o        //copy of int o
//4      //int sum      //The sum stores the sum of digits
//5      //int product  //product of all digits