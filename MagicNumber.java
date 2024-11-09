// 7. Magic Number
// Logic: A number where the sum of its digits repeatedly added together 
// equals 1.
// Examples:
// o 1729: 1 + 7 + 2 + 9 = 19, 1 + 9 = 10, 1 + 0 = 1.
// o 19: 1 + 9 = 10, 1 + 0 = 1.

import java.util.Scanner;

public class MagicNumber {

    public static boolean Magic(int num){
    while(num>=10){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        num =sum;
    }
    return (num == 1);
    }
     public static void main(String[]args){
     System.out.print("Provide a number:");
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();

        if(Magic (number)) System.out.println(number+" is a Magic number");
        else System.out.println(number+" is not a Magic  number");
        sc.close();
}
}
