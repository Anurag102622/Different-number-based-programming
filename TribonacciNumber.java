// 6. Tribonacci Number
// Logic: A number that is part of a sequence where each term is the sum of 
// the preceding three terms, starting with 0, 1, and 1.
// Examples:
// o 4: Sequence = 0, 1, 1, 2, 4...
// o 13: Sequence = 0, 1, 1, 2, 4, 7, 13...
import java.util.*;
public class TribonacciNumber{
    public static boolean Tribonacci(int number){
        int a =0;
        int b =1;
        int c =1;
        if(number == 1 || number == 0) return true;
        int store = a+b+c;
        while(store<=number){
            if(store == number) return true;
            a=b;
            b=c;
            c=store;
            store = a+b+c;
        }
        return false;
    }
    public static void main(String[] args){
    System.out.print("Provide a number:");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    if(Tribonacci(number)) System.out.println(number+" is a Tribonacci number");
    else System.out.println(number+" is not a Tribonacci number");
    sc.close();
}
}
