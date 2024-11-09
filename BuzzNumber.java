// 4. Buzz Number
// Logic: A number divisible by 7 or ends with a 7.
// Examples:
// o 49: Divisible by 7.
// o 27: Ends with 7.

import java.util.*;
public class BuzzNumber {
    public static boolean Buzz(int num){
        return (num%7 == 0 || num%10 == 7 ); 
}
    public static void main (String[] args){
        System.out.print("Provide a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(Buzz(num)) System.out.println(num+" is a Buzz number");
        else System.out.println(num+" is not a Buzz number");


    }
}
