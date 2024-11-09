// 13.Harshad Magic Number
// Logic: A Harshad number where the sum of the digits, when repeatedly 
// added, equals 1.
// Examples:
// o 1729: It's a Harshad number (as seen above), and 1 + 7 + 2 + 9 = 19
// and 1729 divisible by 19 and now 1 + 9 = 10, 1 + 0 = 1.
import java.util.Scanner;

public class HarshadmagicNumber {
    public static boolean isHarshadMagic(int num) {
        int original = num;
        
       
        int sumOfDigits = 0;
        while (num > 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }

       
        if (original % sumOfDigits != 0) {
            return false;
        }

        
        while (sumOfDigits >= 10) {
            int tempSum = 0;
            while (sumOfDigits > 0) {
                tempSum += sumOfDigits % 10;
                sumOfDigits /= 10;
            }
            sumOfDigits = tempSum;
        }

       
        return sumOfDigits == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide a number: ");
        int number = sc.nextInt();

        if (isHarshadMagic(number)) {
            System.out.println(number + " is a Harshad magic number.");
        } else {
            System.out.println(number + " is not a Harshad magic number.");
        }

        sc.close();
    }
}
