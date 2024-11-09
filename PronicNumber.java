// 11.Pronic Number
// Logic: A number that is the product of two consecutive integers.
// Examples:
// o 12: 3 × 4 = 12.
// o 20: 4 × 5 = 20.

import java.util.Scanner;

public class PronicNumber {
    public static boolean isPronic(int num){
        
        for(int i=0 ; i<num; i++){
            if ((i*(i+1)) == num ) return true; 
        }
        return false;
    }
    public static void main(String[] args){
        System.out.print("Provide a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(isPronic(number)) System.out.println(number+" is a Pronic number");
        else System.out.println(number+" is not a Pronic number");
    }
}
