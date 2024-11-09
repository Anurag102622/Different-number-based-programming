// 15.Niven Number (Same as Harshad Number)
// Logic: A number divisible by the sum of its digits.
// Examples:
// o 18: Sum of digits = 1 + 8 = 9, and 18 ÷ 9 = 2.
// o 24: Sum of digits = 2 + 4 = 6, and 24 ÷ 6 = 4.

import java.util.Scanner;

public class NivenNumber  {
    public static boolean isNiven(int num){
        int sum = 0;
        int duplicate = num;
        while(num > 0){
            sum += num%10;
            num/=10;
        }
        return (duplicate % sum == 0);
    }
    public static void main(String[] args){
        System.out.print("Provide a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(isNiven(number)) System.out.println(number+" is a Nivennumber");
        else System.out.println(number+" is not a Niven number");
    }
    
}
