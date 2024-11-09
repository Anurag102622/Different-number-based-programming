// 10.Armstrong Number
// Logic: A number where the sum of its digits each raised to the power of the 
// number of digits equals the number itself.
// Examples:
// o 153: 1³ + 5³ + 3³ = 1 + 125 + 27 = 153.
// o 370: 3³ + 7³ + 0³ = 27 + 343 + 0 = 370.

import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrong( String num){
        int power = num.length();
        int number = Integer.parseInt(num);
        int original = number;
        int sum = 0;
        while(number>0){
            sum += Math.pow(number%10, power);
            number /= 10;
        }
        return (original == sum);
    }
     public static void main(String[] args){
        System.out.print("Provide a number:");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        if(isArmstrong(number)) System.out.println(number+" is a armstrong number");
        else System.out.println(number+" is not a armstrong number");
    }
}
