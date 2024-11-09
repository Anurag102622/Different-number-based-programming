// 16.Bouncy Number
// Logic: A number whose digits are neither entirely increasing nor entirely 
// decreasing.
// Examples:
// o 132: The digits are not entirely increasing or decreasing.
// o 253: The digits go increasing from 2 to 5, then decreasing from 5 to 3

import java.util.Scanner;

public class BouncyNumber {
    public static boolean isBouncy(int num) {
        
        String numStr = Integer.toString(num);

       
        boolean isIncreasing = false;
        boolean isDecreasing = false;

       
        for (int i = 0; i < numStr.length() - 1; i++) {
            
            if (numStr.charAt(i) < numStr.charAt(i + 1)) {
                isIncreasing = true;
            }
            
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                isDecreasing = true;
            }
        }

       
        return isIncreasing && isDecreasing;
    }

    public static void main(String[] args) {
        System.out.print("Provide a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (isBouncy(number)) {
            System.out.println(number + " is a Bouncy number");
        } else {
            System.out.println(number + " is not a Bouncy number");
        }

        sc.close();
    }
}

