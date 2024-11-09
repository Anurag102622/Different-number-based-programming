// 9. Neon Number
// Logic: A number where the sum of the digits of its square is equal to the 
// number itself.
// Examples:
// o 9: 9² = 81, Sum of digits = 8 + 1 = 9.
// o 1: 1² = 1, Sum of digits = 1.

import java.util.Scanner;

public class NeonNumber {
    public static boolean isNeon(int num){
        int newNum = num*num;
        int digitSum  = 0;
        while ( newNum>0 ){
            digitSum += newNum%10;
            newNum /= 10;
        }
        return (digitSum == num);

    }
     public static void main(String[] args){
        System.out.print("Provide a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(isNeon(number)) System.out.println(number+" is a Neon number");
        else System.out.println(number+" is not a Neon number");
    }
}
