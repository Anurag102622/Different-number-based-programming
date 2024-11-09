// 5. Disarium Number
// Logic: A number where the sum of its digits powered by their respective 
// positions equals the number itself.
// Examples:
// o 175: 1¹ + 7² + 5³ = 1 + 49 + 125 = 175.
// o 89: 8¹ + 9² = 8 + 81 = 89

import java.util.Scanner;

   
public class DisariumNumber {
    public static boolean Disarium(String num){
        int originalNum = Integer.parseInt(num);
        int sum = 0;
       
        for(int i =0 ; i<num.length() ; i++){
           int  digit = Character.getNumericValue(num.charAt(i));
           sum += Math.pow(digit,i+1);
        }
        return (originalNum == sum);
    }
    
    public static void main(String[]args){
     System.out.print("Provide a number:");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        if(Disarium (number)) System.out.println(number+" is a Disarium number");
        else System.out.println(number+" is not a Disarium  number");
        sc.close();
}
}
