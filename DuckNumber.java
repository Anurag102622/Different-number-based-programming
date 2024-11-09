// 2. Duck Number
// Logic: A number that contains at least one '0' but not at the beginning.
// Examples:
// o 203: Contains a '0' but doesn’t start with it.
// o 1405: Contains a '0' in the middle.

import java.util.*;

class DuckNumber{
    public static boolean Duck(String num){
        if(num.charAt(0) == '0') return false;
        
        for(int i= 1; i<num.length(); i++){
            if(num.charAt(i)=='0') return true;
        }
        return false;

     }
    
    public static void main(String[] args){
    
    // if we try to store 0 as leading digit of an integer 
    // java will take it as an octal number(0-9)
    Scanner sc = new Scanner(System.in);
    System.out.print("provide a number:");
    String num = sc.nextLine();

    if(Duck(num))  System.out.println(num+" is a Duck number ");
    else  System.out.println(num+" is not a Duck number ");
    

}
}
