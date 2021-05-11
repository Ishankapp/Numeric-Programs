//this program is to check if a number is a armstrong number or not
import java.util.Scanner;
 class Armstrong_number
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        //number is number which needs to be checked
        int number =sc.nextInt();        
        int  o, remainder;double result = 0;
        o = number;
        while (o != 0)
        {
            remainder = o % 10;
            result += Math.pow(remainder, 3);
            o /= 10;
        }
        if(result == number)
        {
            System.out.println(number + "  Armstrong number.");
        }
        else
        {
            System.out.println(number + " not a Armstrong number.");
        }
    }
}
//vdt
//S.No      //Variable     //Function
//1         //int number   //to check whether number is armstrong or not
//2         //int o        //o is to check whether number is greater than zero
//3        //int remainder //remainder is remainder of number so that it can be checked if it is armstrong number or not
//4        //double result //the result after calculation