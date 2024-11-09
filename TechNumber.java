// 3. Tech Number
// Logic: A number with an even number of digits that can be split into two 
// parts, and the square of their sum equals the number.
// Examples:
// o 2025: Split into 20 and 25, Sum = 20 + 25 = 45, (45)² = 2025.
// o 3025: Split into 30 and 25, Sum = 30 + 25 = 55, (55)² = 3025.
import java.util.*;
public class TechNumber {
    public static boolean Tech (String num){
        if(num.length()%2 != 0) return false;
        int midpoint = num.length()/2;

        // split the number into two halves
        String firstHalf = num.substring(0,midpoint);
        String secondHalf = num.substring(midpoint,num.length());

        
        //converting string into numbers
        int first = Integer.parseInt(firstHalf);
        int second = Integer.parseInt(secondHalf);

        // final calculation
        int TechNum = (first+second) * (first+second);
        int originalNum = Integer.parseInt(num);

        return  (TechNum == originalNum);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("provide a number:");
        String num = sc.nextLine();

        if(Tech(num)) System.out.println(num+" is a Tech number");
        else System.out.println(num+" is not a Tech number");
    }
    
}
