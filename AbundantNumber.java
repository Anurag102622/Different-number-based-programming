// 8. Abundant Number
// Logic: A number where the sum of its proper divisors (excluding itself) is 
// greater than the number itself.
// Examples:
// o 12: Divisors = 1, 2, 3, 4, 6; Sum = 1 + 2 + 3 + 4 + 6 = 16 > 12.
// o 18: Divisors = 1, 2, 3, 6, 9; Sum = 1 + 2 + 3 + 6 + 9 = 21 > 18.

import java.util.Scanner;

public class AbundantNumber {

    public static boolean isAbundant(int num){
        if (num<=1 ) return false;
        int sumDiv = 0;
        for(int i=1; i<num ;i++){
           if(num%i == 0) sumDiv += i; 
        }
        return (sumDiv > num);
    }

        public static void main(String[] args){
        System.out.print("Provide a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(isAbundant(number)) System.out.println(number+" is a Abundant number");
        else System.out.println(number+" is not a Abundant number");
        sc.close();
    }
}
