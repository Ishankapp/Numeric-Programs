//program to find whether a number is palindromw or not
import java.util.Scanner;
class Palindrome_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}
//vdt
//S.No       //Variable      //Function
//1          //num           //it is the number which needs to be checked whether it is palidrome
//2          //int reversd integer //it stores reversed integer
//3          //int remainder //it is to store the remainder
            
        