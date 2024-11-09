// 1. Spy Number
// Logic: A number where the sum of the digits is equal to the product of the 
// digits.
// Examples:
// o 112: Sum = 1 + 1 + 2 = 4, Product = 1 × 1 × 2 = 4
// o 22: Sum = 2 + 2 = 4, Product = 2 × 2 = 4
// Both have sum = product.
import java.util.*;

class SpyNumber{
    public static boolean spy(int num){
        int sum = 0;
        int product = 1;
        int digit = 0;
        while(num>0){

           digit = num%10;
           sum += digit;
           product *= digit;
           num /=10;  
        }

       return sum == product;
    }
    
    public static void main(String[] args){
        System.out.print("Provide a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(spy(number)) System.out.println(number+" is a spy number");
        else System.out.println(number+" is not a spy number");
    }
}
