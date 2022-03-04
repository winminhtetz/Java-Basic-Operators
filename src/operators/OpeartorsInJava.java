package operators;

/** Operators
 *  1. Unary Operator       : ++, --
 *  2. Arithmetic Operator  : *, /, %, +, -
 *  3. Relational Operator  : <, >, >=, <=, ==, !=
 *  4. Bitwise Operator     : &, ^, |
 *  5. Logical Operator     : &&, ||
 *  6. Assignment Operator  : =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
 *  7.
 *  8.
 */

//Operands တွေကို အနှစ်ချုပ်ရင် -
    //1. Unary Operator : operand တစ်ခုစာ အလုပ်လုပ်ပေး။
    //2. Binary Operator   : operand နှစ်ခုစာ အလုပ်လုပ်ပေး။
    //3. Ternary Operator : operand သုံးခုစာ အလုပ်လုပ်ပေး။

public class OpeartorsInJava1 {
    public static void main(String[] args) {
        //Unary Operator : ++, --
        // ++a : prefix
        // a-- : postfix
        int num1 = 4;
        System.out.println("num1   : "+ num1);
        System.out.println("num1++ : "+ num1++); //4
        System.out.println();
        int num2 = 4;
        System.out.println("num2   : "+ num2);
        System.out.println("++num2 : "+ ++num2); //5


        //Arithmetic operator => * , / , % , +, -
        int plus = 15 + 19;
        System.out.println("15 + 19 = "+ plus);
        int minus = 20 - 5;
        System.out.println("20 - 5 = "+ minus);
        int multiply = 20 * 4;
        System.out.println("20 * 4 = "+ multiply);
        int divided = 12 / 4;
        System.out.println("12 / 4 = "+ divided);
        int modulus = 34 % 3;
        System.out.println("36 % 3 = "+ modulus);

    }
}
