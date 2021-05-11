//to check whether a number is pronic or not
import java.util.Scanner;
 class Pronic { 
 
    public static void main(String args[]) 
    { 
        //asking user to input number which needs to be checked 
        System.out.println("Enter input number ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();        
        int s = (int) Math.sqrt(i);
        int product = s * (s + 1);
        if (product == i)
            System.out.println("Pronic Number");
        else
            System.out.println("Not a Pronic Number"); 
 
   }
}
//vdt
//S.No      //Variable         //Function
//1         //int i            //the number which needs to be checked 
//2         //int s            //the square root of number
//3         //int product      //the number which comes after multiplying s with s+1
   
