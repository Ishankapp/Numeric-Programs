//program to display fibonacci numbers till 10 numbers
import java.util.Scanner;
 class Fibonacci 
 {
    public static void main(String args[]) 
    {
        //to specify range until fibonacci series needs to be dispalyed till
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int t = 0;
        int m = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 0; i < n;i++)
        {
            System.out.print(t + " + ");
            int sum = t + m;
            t = m;
            m = sum;
        }
    }
}
//vdt
//S.No       //Variable       //Function
//1          //int n          //the range till fibonacci series needs to be displayed
//2          //int t          //the first number
//3          //int m          //the second number
//4          //int sum       //the sum of two number which acts as first number