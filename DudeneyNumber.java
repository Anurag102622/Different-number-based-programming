// 14.Dudeney Number
// Logic: A number where the sum of the digits equals the cube root of the 
// number.
// Examples:
// o 512: Cube root of 512 = 8, Sum of digits = 5 + 1 + 2 = 8.
// o 1: Cube root of 1 = 1, Sum of digits = 1.

import java.util.Scanner;

public class DudeneyNumber {
    public static boolean isDudeney(int num){
        int cubeRoot =(int) Math.cbrt(num);

        int original = num;
        int sumOfDigit = 0;
        while( num>0 ){
            sumOfDigit += num%10;
            num /= 10;
        }
        return (sumOfDigit == cubeRoot);

    }
    public static void main(String[] args){
        System.out.print("Provide a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(isDudeney(number)) System.out.println(number+" is a Dudeney number");
        else System.out.println(number+" is not a Dudeney number");
        sc.close();
    }
    
}
